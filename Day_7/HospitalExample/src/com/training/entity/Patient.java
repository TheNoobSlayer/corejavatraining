package com.training.entity;

public class Patient {
	private int patientNumber;
	private String patientName;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientNumber, String patientName) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
	}
	public int getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		result = prime * result + patientNumber;
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
		Patient other = (Patient) obj;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		if (patientNumber != other.patientNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", patientName=" + patientName + "]";
	}
}
