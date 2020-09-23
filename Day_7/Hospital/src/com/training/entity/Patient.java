package com.training.entity;

public class Patient {
	private String patientName;
	private int patientId;
	private int age;
	private Doctor appointedDoc;
	public Patient(String patientName, int patientId,int age, Doctor appointedDoc) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.age=age;
		this.appointedDoc = appointedDoc;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", age=" + age + ", appointedDoc="
				+ appointedDoc + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Doctor getAppointedDoc() {
		return appointedDoc;
	}
	public void setAppointedDoc(Doctor appointedDoc) {
		this.appointedDoc = appointedDoc;
	}
	
}
