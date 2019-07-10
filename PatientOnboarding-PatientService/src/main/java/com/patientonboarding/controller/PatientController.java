package com.patientonboarding.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.dao.PatientDao;
import com.patientonboarding.model.InsurancePolicy;
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
	public Patient updatingPatientDemographics(@RequestParam String homePhoneParam,
			@RequestParam String cellPhoneParam, @RequestParam String Address1Param,
			@RequestParam String Address2Param, @RequestParam String cityParam, 
			@RequestParam String stateParam, @RequestParam int zipParam, 
			@RequestParam String SSNParam){
		
		String homePhone = homePhoneParam;
		String cellPhone = cellPhoneParam;
		String address1 = Address1Param;
		String address2 = Address2Param;
		String city = cityParam;
		String state = stateParam;
		int zip = zipParam;
		String SSN = SSNParam;
		
		Patient newPatient = patient;
		newPatient.setHomePhone(homePhone);
		newPatient.setCellPhone(cellPhone);
		newPatient.setAddress1(address1);
		newPatient.setAddress2(address2);
		newPatient.setCity(city);
		newPatient.setState(state);
		newPatient.setZip(zip);
		newPatient.setSSN(SSN);
		patientDao.save(newPatient);
		
		return newPatient;
	}
		
	@GetMapping(value="/getPatient")
	public Patient getPatient(@RequestParam String Fname) {
		
		Patient newpatient = patientDao.findByFname(Fname);
		
		
		return newpatient;	
	}
	
	
}
