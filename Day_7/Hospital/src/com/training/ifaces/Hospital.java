package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Doctor;
import com.training.entity.Patient;

public interface Hospital {
	
	Collection<Doctor> getAllDoctors();
	Collection<Doctor> getDoctor();
	Collection<Patient> getAllPatients();
	Collection<Patient> getPatient();
	boolean addDoctor(Doctor doc);
	boolean addPatient(Doctor doc,Patient pat);
	boolean removeDoctor(Doctor doc);
	boolean removePatient(Patient pat);
}
