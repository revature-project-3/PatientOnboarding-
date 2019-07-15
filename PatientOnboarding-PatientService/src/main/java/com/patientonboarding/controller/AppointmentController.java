package com.patientonboarding.controller;

import java.util.Calendar;

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
		
		// String dateRequested = getDateFromString(dateParam);
		appointment = new Appointment(dateParam,timeParam);
		appointmentDao.save(appointment);
		
		return appointment;	
	}
/*
	private String getDateFromString(String dateParam) {
		Calendar date1 = Calendar.getInstance();
		date1.set(2019, 06, 12);

		while (date1.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
		    date1.add(Calendar.DATE, 1);
		}

		System.out.println(date1.getTime());
		return null;
	}
*/	
	

}
