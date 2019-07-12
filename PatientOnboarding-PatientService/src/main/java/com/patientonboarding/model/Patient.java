package com.patientonboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	@Id
	@Column(name="patient_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;
	
	@Column(name="patient_fname")
	private String Fname;
	
	@Column(name="patient_lname")
	private String Lname;
	
	@Column(name="patient_dob")
	private String DOB;
	
	@Column(name="patient_home")
	private String HomePhone;
	
	@Column(name="patient_cell")
	private String CellPhone;
	
	@Column(name="patient_address1")
	private String Address1;
	
	@Column(name="patient_address2")
	private String Address2;
	
	@Column(name="patient_city")
	private String City;
	
	@Column(name="patient_state")
	private String State;
	
	@Column(name="patient_zip")
	private int zip;
	
	@Column(name="patient_ssn")
	private String SSN;
	
	@Column(name="InsurancePolicy")
	private InsurancePolicy insurancePolicy;
	
	
	
	



	public Patient() {
		super();
	}
	


	public Patient(String fname, String lname, String dOB, String homePhone,String cellPhone, 
				String address1, String address2, String city, String state, int zip, String sSN) {
		super();
		this.Fname = fname;
		this.Lname = lname;
		this.DOB = dOB;
		this.HomePhone = homePhone;
		this.CellPhone = cellPhone;
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
		return Fname;
	}
	
	public void setFname(String fname) {
		Fname = fname;
	}
	
	public String getLname() {
		return Lname;
	}
	
	public void setLname(String lname) {
		Lname = lname;
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
	
	public String getCellPhone() {
		return CellPhone;
	}
	
	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
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
		return "Patient [patientId=" + patientId + ", Fname=" + Fname + ", Lname=" + Lname + ", DOB=" + DOB
				+ ", HomePhone=" + HomePhone + ", CellPhone=" + CellPhone + ", Address1=" + Address1 + ", Address2="
				+ Address2 + ", City=" + City + ", State=" + State + ", zip=" + zip + ", SSN=" + SSN
				+ ", insurancePolicy=" + insurancePolicy.getPolicyID() + "]";
	}
	
	
	
	

}
