package com.patientonboarding.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.model.Patient;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/patient")
public class PatientController {
		

	@PersistenceContext
	private EntityManager em;
	
	private Patient patient;
	
}
