package com.patientonboarding.controller;

import javax.persistence.EntityManager;

import org.springframework.data.annotation.Persistent;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientonboarding.dao.AppointmentDao;
import com.patientonboarding.model.Appointment;
import com.patientonboarding.model.Patient;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/appointment")
public class AppointmentController {
	
	@Persistent
	private EntityManager em;
	
	private Appointment appointment;
	private AppointmentDao appointmentDao;

	public AppointmentController(AppointmentDao appointmentDao) {

		this.appointmentDao = appointmentDao;
	}
	
	@GetMapping(value="/getAppointment")
	public Appointment getPatient(@RequestParam String dateParam, @RequestParam String timeParam) {
		
		appointment = new Appointment("7/9/2019","11:00 am");
		
		return appointment;	
	}
	
	

}
