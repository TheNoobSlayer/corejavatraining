/**
 * 
 */
package com.training.entity;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author DELL
 *
 */
public class Appointment {
	
	private HashMap<Doctor,HashSet<Patient>> appointments;

	/**
	 * 
	 */
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
		this.appointments=new  HashMap<Doctor,HashSet<Patient>>();
	}

	/**
	 * @param appointments
	 */
	public Appointment(HashMap<Doctor, HashSet<Patient>> appointments) {
		super();
		this.appointments = appointments;
	}

	/**
	 * @return the appointments
	 */
	public HashMap<Doctor, HashSet<Patient>> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(HashMap<Doctor, HashSet<Patient>> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "Appointment [appointments=" + appointments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointments == null) ? 0 : appointments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (appointments == null) {
			if (other.appointments != null)
				return false;
		} else if (!appointments.equals(other.appointments))
			return false;
		return true;
	}
	
	
}
