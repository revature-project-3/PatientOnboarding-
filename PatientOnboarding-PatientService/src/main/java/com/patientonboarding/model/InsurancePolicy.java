package com.patientonboarding.model;

public class InsurancePolicy {
	
	
	private String providerName;
	private int policyID;
	private String type;
	private String phoneNumber;
	
	public InsurancePolicy() {
		super();
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
