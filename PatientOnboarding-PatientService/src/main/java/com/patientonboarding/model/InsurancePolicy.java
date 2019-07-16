package com.patientonboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Insurance")
public class InsurancePolicy {
	
	@Id
	@Column(name="policy_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyID;
	
	@Column(name="providerName")
	private String providerName;	
	
	@Column(name="type")
	private String type;
	
	@Column(name="phone")
	private String phoneNumber;
	
	public InsurancePolicy() {
		super();
		// policyID = 0;
		providerName = "None";
		type = "N/A";
		phoneNumber = "N/A";
	}

	public InsurancePolicy(String providerName, int policyID, String type, String phoneNumber) {
		super();
		this.providerName = providerName;
		this.policyID = policyID;
		this.type = type;
		this.phoneNumber = phoneNumber;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public int getPolicyID() {
		return policyID;
	}

	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [providerName=" + providerName + ", policyID=" + policyID + ", type=" + type
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
