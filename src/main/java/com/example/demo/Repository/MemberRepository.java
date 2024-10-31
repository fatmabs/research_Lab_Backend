package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	
	 @Query("SELECT p FROM Member p WHERE p.cin LIKE %:cin%")
	 List<Member> findByCin(@Param("cin")String cin);
	 
	 @Query("SELECT p FROM Member p WHERE p.name LIKE %:name%")
	 List<Member> findByName(@Param("name") String name);
	 
	


}
