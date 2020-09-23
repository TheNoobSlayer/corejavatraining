/**
 * 
 */
package com.training;

import com.training.dao.HospitalService;
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
		Doctor doc1=new Doctor(101,"Dr Cooper");
		Doctor doc2=new Doctor(102,"Dr Hofstater");
		Doctor doc3=new Doctor(103,"Dr Kothrapali");
		
		Patient pat1=new Patient(1001,"Aditya",doc1);
		Patient pat2=new Patient(1002,"Bo",doc1);
		Patient pat3=new Patient(1003,"Sidhu",doc1);
		Patient pat4=new Patient(1004,"Tambe",doc2);
		Patient pat5=new Patient(1005,"Doke",doc2);
		Patient pat6=new Patient(1006,"Chinu",doc3);
		Patient pat7=new Patient(1007,"Buu",doc3);
		
		sayadri.addDoctor(doc1);
		sayadri.addDoctor(doc2);
		sayadri.addDoctor(doc3);
		
		sayadri.addPatient(pat1, doc1);
		sayadri.addPatient(pat2, doc1);
		sayadri.addPatient(pat3, doc1);
		sayadri.addPatient(pat4, doc2);
		sayadri.addPatient(pat5, doc2);
		sayadri.addPatient(pat6, doc3);
		sayadri.addPatient(pat7, doc3);
		
		System.out.println(sayadri.viewAppointment(doc1));
		System.out.println(sayadri.viewAppointment(doc2));
		System.out.println(sayadri.viewAppointment(doc3));
		
		sayadri.removePatient(pat2);
		System.out.println(sayadri.viewAppointment(doc1));
		
		sayadri.removeDoctor(doc1);
		System.out.println(sayadri.viewAppointment(doc1));
		
	}

}
