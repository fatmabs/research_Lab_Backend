package com.example.demo.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Evenement;

@Repository
public interface EventRepository extends JpaRepository<Evenement, Long> {
	
	 @Query("SELECT e FROM Evenement e WHERE e.title LIKE %:title%")
	 List<Evenement> findByTitle(@Param("title")String title);
	 
	 @Query("SELECT e FROM Evenement e WHERE e.Event_date = :Event_date")
	 List<Evenement> findByEventDate(@Param("Event_date") Date Event_date);
	 
}
