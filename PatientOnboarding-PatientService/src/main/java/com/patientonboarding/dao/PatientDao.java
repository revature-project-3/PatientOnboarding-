package com.patientonboarding.dao;

import org.springframework.data.repository.CrudRepository;

import com.patientonboarding.model.Patient;

public interface PatientDao extends CrudRepository<Patient,Integer>{

	public Patient findByFname(String Fname, String Lname);
	
}
