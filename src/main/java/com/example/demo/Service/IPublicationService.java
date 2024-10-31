package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import com.example.demo.Model.Publication;

public interface IPublicationService {

	  public List<Publication> findAll();
	    
	    public Publication findById(Long id);
	    
	    public void save(Publication publication);
	    
	    public void update(Publication publication);
	     
	    public void delete(Long id);
	    
	    public List<Publication> findByPublicationType(String publicationType);
	    
	    public List<Publication> findByPublicationDate(Date publicationDate);
	
}
