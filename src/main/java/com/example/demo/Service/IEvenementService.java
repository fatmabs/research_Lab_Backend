package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import com.example.demo.Model.Evenement;

public interface IEvenementService {
	
	  public List<Evenement> findAll();
	    
	    public Evenement findById(Long id);
	    
	    public void save(Evenement evenement);
	    
	    public void update(Evenement evenement);
	     
	    public void delete(Long id);
	    
	    public List<Evenement> findByTitle(String title);
	    
	    public List<Evenement> findByEventDate(Date eventDate);
}
