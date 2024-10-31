package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Evenement;
import com.example.demo.Service.EventService;

@RestController
@RequestMapping("/events")
public class EventsController {

	@Autowired
	EventService eventService;
	
	
	//get All Members
    @GetMapping
    public List<Evenement> eventsList(){
		return eventService.findAll();
    }
    
    @PostMapping
    public void createEvent(@RequestBody Evenement event) {
    	eventService.save(event);
    }
    
}
