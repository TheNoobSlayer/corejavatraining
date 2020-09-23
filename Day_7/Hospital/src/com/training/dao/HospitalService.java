package com.training.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import com.training.entity.Appointments;
import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.ifaces.Hospital;

public class HospitalService implements Hospital {
	
	private ArrayList<Doctor> docList=new ArrayList<Doctor>();
	private ArrayList<Patient> patientList=new ArrayList<Patient>();
	private Appointments appointments;
	
	public HospitalService() {
		super();
		this.docList = docList;
		this.appointments = appointments;
		appointments=new Appointments();
	}

	
	
	
	@Override
	public Collection<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		
		return this.docList;
	}

	@Override
	public Collection<Doctor> getDoctor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		
		return this.patientList;
	}

	@Override
	public Collection<Patient> getPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		
		return this.docList.add(doc);
	}

	@Override
	public boolean addPatient(Doctor doc,Patient pat) {
		// TODO Auto-generated method stub
		
		return this.appointments.addAppointment(doc, pat);
	}

	@Override
	public boolean removeDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePatient(Patient pat) {
		// TODO Auto-generated method stub
		return this.appointments.cancelAppointment(pat.getAppointedDoc(), pat);
	}
	
	public HashMap<Doctor,HashSet<Patient>> getAllAppointments(){
		return this.appointments.getAppointments();
	}

}
