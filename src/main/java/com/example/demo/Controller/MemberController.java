package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Member;
import com.example.demo.Service.MemberService;


@RestController
@RequestMapping("/api")

public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/members")
	public ResponseEntity<List<Member>> membersList() {
	    List<Member> members = memberService.findAll();
	    return new ResponseEntity<>(members, HttpStatus.OK);
	}
    
	
	@PostMapping("/members")
	public ResponseEntity<String> createMember(@RequestBody Member member) {
	    memberService.save(member);
	    return new ResponseEntity<>("Member created successfully", HttpStatus.CREATED);
	}
    
    
  

}
