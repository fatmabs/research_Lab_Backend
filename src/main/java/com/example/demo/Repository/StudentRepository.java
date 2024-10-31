package com.example.demo.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	 @Query("SELECT e FROM Student e WHERE e.inscription_date =:inscription_date")
	 List<Student> findByIncriptionDate(@Param("inscription_date") Date inscription_date);

}
