package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Evenement;
import com.example.demo.Model.Member;
import com.example.demo.Repository.MemberRepository;

@Service
public class MemberService implements IMemberService{

	@Autowired
	MemberRepository memberRepo;
	
	@Override
	public List<Member> findAll() {
		return memberRepo.findAll();
	}

	@Override
	public Member findById(Long id) {
		
		return null;
	}

	@Override
	public void save(Member member) {
		 memberRepo.save(member);		
	}

	@Override
	public void update(Member member) {
		memberRepo.save(member);		
	}

	@Override
	public void delete(Long id) {
		memberRepo.deleteById(id);		
		
	}

	@Override
	public List<Member> findByCin(String cin) {
		return memberRepo.findByCin(cin);
	}

	@Override
	public List<Member> findByName(String name) {
		return memberRepo.findByName(name);
	}
	

}
