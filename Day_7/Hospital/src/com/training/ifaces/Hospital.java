package com.training.ifaces;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.training.entity.Doctor;
import com.training.entity.Patient;

public interface Hospital {
	
	public boolean addDoctor(Doctor doc);
	public boolean removeDoctor(Doctor doc);
	public boolean addPatient(Patient pat,Doctor doc);
	public boolean removePatient(Patient pat);
	public boolean addAppointment(Doctor doc,Patient pat);
	public HashSet cancelAppointment(Doctor doc,Patient pat);
	public HashSet viewAppointment(Doctor doc);
	
}
