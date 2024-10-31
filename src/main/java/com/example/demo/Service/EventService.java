package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Evenement;
import com.example.demo.Repository.EventRepository;

@Service
public class EventService implements IEvenementService {
	
	@Autowired
	EventRepository eventRepo;

	@Override
	public List<Evenement> findAll() {
		return eventRepo.findAll();
	}

	@Override
	public Evenement findById(Long id) {
		return eventRepo.findById(id).orElse(new Evenement());
	}

	@Override
	public void save(Evenement evenement) {
		eventRepo.save(evenement);		
	}

	@Override
	public void update(Evenement evenement) {
		eventRepo.save(evenement);		
	}

	@Override
	public void delete(Long id) {
		eventRepo.deleteById(id);		
	}

	@Override
	public List<Evenement> findByTitle(String title) {
		return eventRepo.findByTitle(title);
	}

	@Override
	public List<Evenement> findByEventDate(Date eventDate) {
		return eventRepo.findByEventDate(eventDate);
	}

}
