package com.patientonboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Demographics")
public class Patient {
	
	@Id
	@Column(name="Patientid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="birthdate",  nullable= false)
	private String DOB;
	
	@Column(name="phone")
	private String HomePhone;
	
	@Column(name="addressline1",  nullable= false)
	private String Address1;
	
	@Column(name="addressline2")
	private String Address2;
	
	@Column(name="city", nullable= false)
	private String City;
	
	@Column(name="state",  nullable= false)
	private String State;
	
	@Column(name="zipcode")
	private int zip;
	
	@Column(name="patient_ssn")
	private String SSN;
	
	@OneToOne
	private InsurancePolicy insurancePolicy;
	
	@OneToOne
	private Appointment appointment;
	
	
	
	



	public Patient() {
		super();
	}
	


	public Patient(String fname, String dOB, String homePhone, 
				String address1, String address2, String city, String state, int zip, String sSN) {
		super();
		this.fname = fname;
		this.DOB = dOB;
		this.HomePhone = homePhone;
		this.Address1 = address1;
		this.Address2 = address2;
		this.City = city;
		this.State = state;
		this.zip = zip;
		this.SSN = "111-11-1111";
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	
	public int getInsurancePolicy() {
		return insurancePolicy.getPolicyID();
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public String getHomePhone() {
		return HomePhone;
	}
	
	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}
	
	public String getAddress1() {
		return Address1;
	}
	
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	
	public String getAddress2() {
		return Address2;
	}
	
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getSSN() {
		return SSN;
	}
	
	public void setSSN(String sSN) {
		SSN = sSN;
	}



	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", Fname=" + fname + ", DOB=" + DOB + ", HomePhone=" + HomePhone
				+ ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City + ", State=" + State + ", zip="
				+ zip + ", SSN=" + SSN + ", insurancePolicy=" + insurancePolicy + "]";
	}



	
	
	
	
	

}
