package com.training.entity;

import java.util.HashMap;
import java.util.Set;

public class Appointment {
	private HashMap<Doctor, Set<Patient>> register;

	public Appointment(HashMap<Doctor, Set<Patient>> register) {
		super();
		this.register = register;
	}

	public HashMap<Doctor, Set<Patient>> getRegister() {
		return register;
	}

	public void setRegister(HashMap<Doctor, Set<Patient>> register) {
		this.register = register;
	}
}
