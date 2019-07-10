package com.patientonboarding.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patientonboarding.model.Appointment;

public interface AppointmentDao extends CrudRepository{

	public List<Appointment> findByDate(String date);
	public List<Appointment> findbyTime(String time);
	public List<Appointment> findByReason(String reason);
}
