package com.training.entity;

import java.util.HashSet;

public class Doctor {
	
	private String docName;
	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", docId=" + docId + "]";
	}

	private int docId;
	
	
	public Doctor(String docName, int docId) {
		super();
		this.docName = docName;
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	
	
}
