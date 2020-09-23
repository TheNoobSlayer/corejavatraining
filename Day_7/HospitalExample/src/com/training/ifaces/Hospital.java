/**
 * 
 */
package com.training.ifaces;

import java.util.Set;

import com.training.entity.Appointment;
import com.training.entity.Doctor;
import com.training.entity.Patient;

/**
 * @author DELL
 *
 */
public interface Hospital {
	public boolean addDoctor(Doctor doctor);
	
	public boolean addPatient(Doctor doctor, Patient patient);
	
	public Set<Patient> returnPatientList(String doctorName);
	
	public Set<Patient> cancelAppointment(Doctor doctor, Patient patient);
}
