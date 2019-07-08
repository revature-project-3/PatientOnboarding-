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
	public InsurancePolicy updatingPatientInsurance(@RequestParam String providerParam,
			@RequestParam String phoneNumberParam, @RequestParam String insuranceTypeParam,
			@RequestParam int policyNumberParam){
		
		String provider = providerParam;
		String phoneNumber = phoneNumberParam;
		String insuranceType = insuranceTypeParam;
		int policyNumber = policyNumberParam;
		
		InsurancePolicy newInsurance = iPolicy;
		newInsurance.setProviderName(provider);
		newInsurance.setPhoneNumber(phoneNumber);
		newInsurance.setType(insuranceType);
		newInsurance.setPolicyID(policyNumber);
		//insuranceDao.save(newInsurance);
		
		return newInsurance;
		//return new InsurancePolicy("bluecross",  254682,"888-956-3598", "medical");
	} 
	
	
}
