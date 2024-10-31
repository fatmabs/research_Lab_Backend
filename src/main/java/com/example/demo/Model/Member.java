package com.example.demo.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)

//class 
@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,      // Use type information to determine the concrete class
	    include = JsonTypeInfo.As.PROPERTY,  // Include type info as a property in JSON
	    property = "type"                // This is the property in JSON that will specify the concrete type
	)
	@JsonSubTypes({
	    @JsonSubTypes.Type(value = Student.class, name = "Student"),
	    @JsonSubTypes.Type(value = Teacher.class, name = "Teacher")
	})
public abstract class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String cin;
	private String email;
	
	@Column(length = 50)
	private String name;
	
	private String family_name;
	
	private String cv;
	@Temporal(TemporalType.DATE)
	private Date BirthDate;
	 
	@OneToMany(mappedBy = "member")
	private List<Publication> publications; 
	
	    
	@ManyToMany 
	@JoinTable(name="member_event", joinColumns= @JoinColumn(name="member_id"),inverseJoinColumns = @JoinColumn(name = "event_id"))
	private Set<Evenement> events= new HashSet<>();










}
