/**
 * 
 */
package com.training.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.training.entity.Appointment;
import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.ifaces.Hospital;


/**
 * @author DELL
 *
 */
public class HospitalService implements Hospital {
	
	private HashMap<Doctor,HashSet<Patient>> appointmentTable;
	
	/**
	 * 
	 */
	public HospitalService() {
		super();
		Appointment appointments=new Appointment();
		this.appointmentTable=appointments.getAppointments();
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public boolean addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		if(appointmentTable!=null) {
			appointmentTable.put(doc, null);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		if(appointmentTable.containsKey(doc)) {
			appointmentTable.remove(doc);
			return true;
		}
		return false;
	}

	@Override
	public boolean addPatient(Patient pat,Doctor doc) {
		// TODO Auto-generated method stub
		if(appointmentTable==null) {
			return false;
		}else if(appointmentTable.containsKey(doc)==true && appointmentTable.get(doc)!=null) {
			HashSet<Patient> patients=appointmentTable.get(doc);
			patients.add(pat);
			appointmentTable.put(doc, patients);
		}else {
			HashSet<Patient> patients=new HashSet<Patient>();
			patients.add(pat);
			appointmentTable.put(doc, patients);
		}
		return false;
	}

	@Override
	public boolean removePatient(Patient pat) {
		// TODO Auto-generated method stub

		HashSet<Patient> patients=appointmentTable.get(pat.getAppointedDoc());
		if(patients.contains(pat)) {
			patients.remove(pat);
			appointmentTable.put(pat.getAppointedDoc(), patients);
			return true;
		}
		return false;
	}



	@Override
	public boolean addAppointment(Doctor doc, Patient pat) {
		// TODO Auto-generated method stub
		if(appointmentTable==null) {
			return false;
		}else if(appointmentTable.containsKey(doc)==true && appointmentTable.get(doc)!=null) {
			HashSet<Patient> patients=appointmentTable.get(doc);
			patients.add(pat);
			appointmentTable.put(doc, patients);
		}else {
			HashSet<Patient> patients=new HashSet<Patient>();
			patients.add(pat);
			appointmentTable.put(doc, patients);
		}
		return false;
	}



	@Override
	public HashSet<Patient> cancelAppointment(Doctor doc, Patient pat) {
		// TODO Auto-generated method stub
		HashSet<Patient> patients=appointmentTable.get(doc);
		if(patients.contains(pat)) {
			patients.remove(pat);
			appointmentTable.put(doc, patients);
			return patients;
		}
		return null;
	}



	@Override
	public HashSet viewAppointment(Doctor doc) {
		// TODO Auto-generated method stub
		//System.out.println(appointmentTable);
		return appointmentTable.get(doc);
	}

}
