package com.abir.vols.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abir.vols.entities.Pilote;



@RepositoryRestResource(path = "pil")
@CrossOrigin(origins = "http://localhost:58566/") //pour autoriser angular

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
	}