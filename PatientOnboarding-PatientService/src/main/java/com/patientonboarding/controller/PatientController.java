package com.patientonboarding.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.dao.PatientDao;
import com.patientonboarding.model.Patient;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/patient")
public class PatientController {
		

	@PersistenceContext
	private EntityManager em;
	
	private Patient patient;
	private PatientDao patientDao;
	
	public PatientController(PatientDao patientDao) {
		this.patientDao = patientDao;
	}
	
	@PostMapping(value="/patientdemo")
	public Patient updatingPatientDemographics(@RequestParam("fullname") String fullNameParam,
			 @RequestParam("phonenumber") String homePhoneParam, @RequestParam("address1") String Address1Param, 
			 @RequestParam("address2") String Address2Param, @RequestParam("city") String cityParam,
			 @RequestParam("email") String emailParam, @RequestParam("birthday") String bdayParam,
			 @RequestParam("state") String stateParam, @RequestParam("zipcode") int zipParam){

			System.out.println("In the patient demo controller "+fullNameParam );
		
		String fullname = fullNameParam;
		String homePhone = homePhoneParam;
		String address1 = Address1Param;
		String address2 = Address2Param;
		String city = cityParam;
		String state = stateParam;
		int zip = zipParam;
	
		
		Patient newPatient = patient;
		newPatient.setFname(fullname);
		newPatient.setHomePhone(homePhone);
		newPatient.setAddress1(address1);
		newPatient.setAddress2(address2);
		newPatient.setCity(city);
		newPatient.setState(state);
		newPatient.setZip(zip);
		newPatient.getSSN();
		System.out.println(newPatient);
		patientDao.save(newPatient);
		
		return newPatient;
	}
		
	
	
	
}
