package com.training;

import java.util.HashMap;
import java.util.Set;

import java.util.*;

import com.training.entity.Appointment;
import com.training.entity.Doctor;
import com.training.entity.Patient;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Doctor, Set<Patient>> map = new HashMap<Doctor, Set<Patient>>();
		
		Appointment appointments = new Appointment(map);
		
		AppointmentService service = new AppointmentService();
		
		Doctor doc1 = new Doctor(1, "Dr Cooper");
		
		Patient pat1 = new Patient(1001, "Aditya");
		Patient pat2 = new Patient(1002, "Bo");
		
		service.addDoctor(doc1);
		
		service.addPatient(doc1, pat1);
		service.addPatient(doc1, pat2);
		
		
		System.out.println("Patient list of "+doc1.getDoctorName()+" ==> ");
		Set<Patient> patientList = service.returnPatientList("Dr Cooper");
		
		Iterator<Patient> iterator = patientList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		service.cancelAppointment(doc1, pat1);
		
		System.out.println("New patient list of "+doc1.getDoctorName()+" ==> ");
		
		Set<Patient> patientListNew = service.returnPatientList("Dr Cooper");
		
		Iterator<Patient> iteratorNew = patientListNew.iterator();
		
		while(iteratorNew.hasNext()) {
			System.out.println(iteratorNew.next());
		}
	}

}
