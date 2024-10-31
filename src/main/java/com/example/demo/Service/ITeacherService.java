package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import com.example.demo.Model.Teacher;

public interface ITeacherService {
	public List<Teacher> findByGrade(String grade);

}
