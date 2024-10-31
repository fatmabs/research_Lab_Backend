package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	@Autowired
	StudentRepository studentRepo;
	
	 public List<Student> findByIncriptionDate(Date date){
			return studentRepo.findByIncriptionDate(date);
		 
	 }

}
