package com.example.demo.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
	
	 @Query("SELECT p FROM Publication p WHERE p.publication_type LIKE %:publication_type%")
	 List<Publication> findByPublicationType(@Param("publication_type")String publication_type);
	 
	 @Query("SELECT p FROM Publication p WHERE p.publication_date =:publication_date")
	 List<Publication> findByPublicationDate(@Param("publication_date") Date publication_date);

}
