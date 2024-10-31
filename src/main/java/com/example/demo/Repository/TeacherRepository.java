package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	
	@Query("SELECT e FROM Teacher e WHERE e.grade LIKE %:grade%")
	 List<Teacher> findByGrade(@Param("grade") String grade);

}