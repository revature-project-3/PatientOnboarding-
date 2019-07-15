package com.patientonboarding.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.dao.PatientDao;
import com.patientonboarding.model.Patient;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/pat")
public class PatientController {
		
	

	@PersistenceContext
	private EntityManager em;
	
	private Patient patient;
	private PatientDao patientDao;
	
	public PatientController(PatientDao patientDao) {
		this.patientDao = patientDao;
	}
	
		
	@PostMapping(value="/patient")
	public ResponseEntity<Patient> updatingPatientDemographics(@RequestParam("fullname") String fullName,
			 @RequestParam("phonenumber") String homePhone, @RequestParam("address1") String Address1, 
			 @RequestParam("address2") String Address2, @RequestParam("city") String city,
			 @RequestParam("email") String email, @RequestParam("birthday") String bday,
			 @RequestParam("state") String state, @RequestParam("zipcode") int zip){

		System.out.println("In the patient demo controller "+fullName );
		
		Patient newPatient = patient;
		newPatient.setFname(fullName);
		newPatient.setHomePhone(homePhone);
		newPatient.setAddress1(Address1);
		newPatient.setAddress2(Address2);
		newPatient.setCity(city);
		newPatient.setState(state);
		newPatient.setZip(zip);
		newPatient.getSSN();
		System.out.println(newPatient);
		
		patientDao.save(newPatient);
		
		return new ResponseEntity<Patient>(newPatient, HttpStatus.OK);
	}
		
	
	
	
}
