package com.patientonboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="appointment_description")
	private String description;
	
	public Appointment() {
		super();
	}

	public Appointment(String date, String time) {
		super();
		this.date = date;
		this.time = time;
		this.reason = "Initial Check-up";
		this.description = "Please bring a list of all current perscriptions.";
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

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", time=" + time + ", reason="
				+ reason + ", description=" + description + "]";
	}

	
	
	
}
