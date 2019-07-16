package com.patientonboarding.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patientonboarding.model.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, String> {

	public List<Appointment> findByDate(String date);
	public List<Appointment> findByTime(String time);
	public List<Appointment> findByReason(String reason);
}
