package com.patientonboarding.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.dao.InsuranceDao;
import com.patientonboarding.model.InsurancePolicy;
import com.patientonboarding.model.Patient;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/insurance")
public class InsuranceController {

	@PersistenceContext
	private EntityManager em;
	
	private Patient patient;
	private InsurancePolicy iPolicy;
	private InsuranceDao insuranceDao;
	
	
	
	public InsuranceController(InsuranceDao insuranceDao) {
		this.insuranceDao = insuranceDao;
	}



	@PostMapping(value="/patientInsurance")
	public InsurancePolicy updatingPatientInsurance(@RequestParam("provider") String providerParam,
			@RequestParam("phonenumber") String phoneNumberParam, @RequestParam("type") String insuranceTypeParam,
			@RequestParam("policynumber") int policyNumberParam){
				System.out.println("In the insurance:"+ providerParam);
		
		InsurancePolicy newInsurance = iPolicy;
		newInsurance.setProviderName(providerParam);
		newInsurance.setPhoneNumber(phoneNumberParam);
		newInsurance.setType(insuranceTypeParam);
		newInsurance.setPolicyID(policyNumberParam);
		insuranceDao.save(newInsurance);
		
		return newInsurance;
	} 
	
	
}
