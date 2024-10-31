package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import com.example.demo.Model.Student;

public interface IStudentService {
	
	public List<Student> findByIncriptionDate(Date date);

}
