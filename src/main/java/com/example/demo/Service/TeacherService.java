package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Teacher;
import com.example.demo.Repository.TeacherRepository;

@Service
class TeacherService implements ITeacherService {
	
	@Autowired
	TeacherRepository teacherRepo;

	@Override
	public List<Teacher> findByGrade(String grade) {
		return teacherRepo.findByGrade(grade);
	}

}
