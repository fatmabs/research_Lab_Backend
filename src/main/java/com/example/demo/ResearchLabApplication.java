package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.Member;
import com.example.demo.Model.Student;
import com.example.demo.Service.MemberService;

@SpringBootApplication
//public class ResearchLabApplication implements CommandLineRunner{
public class ResearchLabApplication{
	@Autowired
	MemberService studentService;
	

	public static void main(String[] args) {
		SpringApplication.run(ResearchLabApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		studentService.save(new Student(new Date()));
//		
//	}
}
