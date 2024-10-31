package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Member;


public interface IMemberService {
	
	  public List<Member> findAll();
	    
	    public Member findById(Long id);
	    
	    public void save(Member member);
	    
	    public void update(Member member);
	     
	    public void delete(Long id);
	    
	    public List<Member> findByCin(String cin);
	    
	    public List<Member> findByName(String name);

}
