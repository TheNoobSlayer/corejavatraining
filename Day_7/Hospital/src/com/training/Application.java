/**
 * 
 */
package com.training;

import java.util.HashMap;
import java.util.HashSet;

import com.training.dao.HospitalService;
import com.training.entity.Appointments;
import com.training.entity.Doctor;
import com.training.entity.Patient;

/**
 * @author DELL
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalService sayadri=new HospitalService();
		Doctor doc1=new Doctor("Dr Cooper", 001);
		Doctor doc2=new Doctor("Dr Koothrapali", 002);
		Doctor doc3=new Doctor("Dr Hofstater", 003);
		
		Patient pat1=new Patient("Aditya", 1000, 22, doc1);
		Patient pat2=new Patient("Bo", 1001, 22, doc2);
		Patient pat3=new Patient("Buu", 1002, 22, doc3);
		
		sayadri.addDoctor(doc1);
		
		
		sayadri.addPatient(doc1, pat1);
		sayadri.addPatient(doc1, pat2);
		sayadri.addPatient(doc1, pat3);
		
		sayadri.removePatient(pat2);
		sayadri.getAllAppointments();
	}
	
	
	
	

}
