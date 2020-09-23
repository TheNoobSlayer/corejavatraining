package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.entity.Appointment;
import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.ifaces.Hospital;

public class AppointmentService implements Hospital {
	
	Appointment appointments;
	HashMap<Doctor, Set<Patient>> map = new HashMap<Doctor, Set<Patient>>();
	
	
	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		register.put(doctor, null);
		
		return false;
	}

	@Override
	public boolean addPatient(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		
		if(register.containsKey(doctor) && register.get(doctor) != null) {
			Set<Patient> patients = register.get(doctor);
			patients.add(patient);
			register.put(doctor, patients);
		}
		else {
			Set<Patient> patients = new HashSet<Patient>();
			patients.add(patient);
			register.put(doctor,patients);
		}
		return false;
	}

	@Override
	public Set<Patient> returnPatientList(String doctorName) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();

		Set<Map.Entry<Doctor, Set<Patient>>> set = register.entrySet();
		
		for(Map.Entry<Doctor, Set<Patient>> eachEntry: set) {
			Doctor doctor = eachEntry.getKey();
			if(doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
				return eachEntry.getValue();
			}
		}
		return null;
	}

	@Override
	public Set<Patient> cancelAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		
		Set<Patient> patients = register.get(doctor);
		
		patients.remove(patient);
		
		return patients;
	}

	public AppointmentService() {
		super();
		this.appointments =new Appointment(map);
	}
}
