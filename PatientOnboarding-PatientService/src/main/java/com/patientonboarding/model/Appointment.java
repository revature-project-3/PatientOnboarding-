package com.patientonboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="appointment_date")
	private String date;
	
	@Column(name="appointment_time")
	private String time;
	
	@Column(name="appointment_reason")
	private String reason= "Initial Check-up";
	
	@Column(name="appointment_description")
	private String description = "Your doctor will ask for your medical history, including:\r\n" + 
			"Blood will be drawn and several laboratory tests will also be done, including:\r\n" + 
			"Your healthcare provider will probably want to discuss the following:\r\n" + 
			"Possible questions to ask your provider include";

	private Patient patient;
	
	public Appointment() {
		super();
	}

	public Appointment(int i, String date, String time, String reason, String description) {
		super();
		this.date = date;
		this.time = time;
		this.reason = "Initial Check-up";
		this.description = "Your doctor will ask for your medical history, including:\r\n" + 
				"Blood will be drawn and several laboratory tests will also be done, including:\r\n" + 
				"Your healthcare provider will probably want to discuss the following:\r\n" + 
				"Possible questions to ask your provider include";
	}


	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getReason() {
		return reason;
	}

	public String getDescription() {
		return this.description;
	}
	
	
	public String getPatient() {
		return patient.getFname();
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", time=" + time + ", reason="
				+ reason + ", description=" + description + ", patient=" + patient + "]";
	}

	
	
	
}
