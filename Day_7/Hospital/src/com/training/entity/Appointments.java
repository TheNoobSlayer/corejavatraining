package com.training.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Appointments {
	private HashSet<Patient> patients;
	private HashMap<Doctor,HashSet<Patient>> appointments;

	
	
	
	
	public HashSet<Patient> getPatients() {
		return patients;
	}

	public void setPatients(HashSet<Patient> patients) {
		this.patients = patients;
	}

	public HashMap<Doctor, HashSet<Patient>> getAppointments() {
		for (Entry<Doctor, HashSet<Patient>> entry : appointments.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		return appointments;
	}

	public void setAppointments(HashMap<Doctor, HashSet<Patient>> appointments) {
		this.appointments = appointments;
	}

	public boolean addAppointment(Doctor doc,Patient pat) {
		if(this.patients.add(pat)) {
			if(this.appointments.put(doc,patients)!=null){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	public boolean cancelAppointment(Doctor doc,Patient pat) {
		if(this.patients.remove(pat)) {
			if(this.appointments.put(doc,patients)!=null){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
