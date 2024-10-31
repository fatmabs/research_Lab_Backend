package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Publication;
import com.example.demo.Repository.PublicationRepository;

@Service
public class PublicationService implements IPublicationService {
	
	@Autowired
	PublicationRepository publicationRepo;

	@Override
	public List<Publication> findAll() {
		return publicationRepo.findAll();
	}

	@Override
	public Publication findById(Long id) {
		return publicationRepo.findById(id).orElse(new Publication());
	}

	@Override
	public void save(Publication publication) {
		publicationRepo.save(publication);
	}

	@Override
	public void update(Publication publication) {
		publicationRepo.save(publication);		
	}

	@Override
	public void delete(Long id) {
		publicationRepo.deleteById(id);		
	}

	@Override
	public List<Publication> findByPublicationType(String publicationType) {
		return publicationRepo.findByPublicationType(publicationType);
	}

	@Override
	public List<Publication> findByPublicationDate(Date publicationDate) {
		return publicationRepo.findByPublicationDate(publicationDate);
	}

}
