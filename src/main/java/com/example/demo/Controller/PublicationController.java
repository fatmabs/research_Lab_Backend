package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Publication;
import com.example.demo.Service.PublicationService;

@RestController
@RequestMapping("/publications")
public class PublicationController {

	@Autowired
	PublicationService publicationService;
	
	
	//get All Members
    @GetMapping
    public List<Publication> publicationsList(){
		return publicationService.findAll();
    }
    
    @PostMapping
    public void createPublication(@RequestBody Publication pub) {
    	publicationService.save(pub);
    }
    
}
