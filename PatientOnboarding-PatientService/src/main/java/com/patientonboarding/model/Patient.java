package com.patientonboarding.model;

import java.sql.Timestamp;

public class Patient {
	
	private String Fname;
	private String Lname;
	private Timestamp DOB;
	private String HomePhone;
	private String CellPhone;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private int zip;
	private String SSN;
	
	
	public Patient() {
		super();
	}
	


	public Patient(String fname, String lname, Timestamp dOB, String homePhone,String cellPhone, 
				String address1, String address2, String city, String state, int zip, String sSN) {
		super();
		Fname = fname;
		Lname = lname;
		DOB = dOB;
		HomePhone = homePhone;
		CellPhone = cellPhone;
		Address1 = address1;
		Address2 = address2;
		City = city;
		State = state;
		this.zip = zip;
		SSN = sSN;
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
	
	public Timestamp getDOB() {
		return DOB;
	}
	
	public void setDOB(Timestamp dOB) {
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
		return "Patient [Fname=" + Fname + ", Lname=" + Lname + ", DOB=" + DOB + ", HomePhone=" + HomePhone 
				+ ", CellPhone=" + CellPhone + ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City 
				+ ", State=" + State + ", zip=" + zip + ", SSN=" + SSN + "]";
	}
	
	

}
