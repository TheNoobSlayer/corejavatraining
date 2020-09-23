/**
 * 
 */
package com.training.entity;

/**
 * @author DELL
 *
 */
public class Patient {
	private int patId;
	private String patName;
	private Doctor appointedDoc;
	/**
	 * 
	 */
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param patId
	 * @param patName
	 * @param appointedDoc
	 */
	public Patient(int patId, String patName, Doctor appointedDoc) {
		super();
		this.patId = patId;
		this.patName = patName;
		this.appointedDoc = appointedDoc;
	}
	/**
	 * @return the patId
	 */
	public int getPatId() {
		return patId;
	}
	/**
	 * @param patId the patId to set
	 */
	public void setPatId(int patId) {
		this.patId = patId;
	}
	/**
	 * @return the patName
	 */
	public String getPatName() {
		return patName;
	}
	/**
	 * @param patName the patName to set
	 */
	public void setPatName(String patName) {
		this.patName = patName;
	}
	/**
	 * @return the appointedDoc
	 */
	public Doctor getAppointedDoc() {
		return appointedDoc;
	}
	/**
	 * @param appointedDoc the appointedDoc to set
	 */
	public void setAppointedDoc(Doctor appointedDoc) {
		this.appointedDoc = appointedDoc;
	}
	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", patName=" + patName + ", appointedDoc=" + appointedDoc + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointedDoc == null) ? 0 : appointedDoc.hashCode());
		result = prime * result + patId;
		result = prime * result + ((patName == null) ? 0 : patName.hashCode());
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
		if (appointedDoc == null) {
			if (other.appointedDoc != null)
				return false;
		} else if (!appointedDoc.equals(other.appointedDoc))
			return false;
		if (patId != other.patId)
			return false;
		if (patName == null) {
			if (other.patName != null)
				return false;
		} else if (!patName.equals(other.patName))
			return false;
		return true;
	}
	
}
