package com.training;

public class Insurance {

	private int policyNumber;
	private String policyHolderName;
	private int age;
	private int insuredAmount;
	
	public Insurance(int policyNumber, String policyHolderName, int age) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
	}

	public Insurance(int policyNumber, String policyHolderName, int age, int insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.insuredAmount = insuredAmount;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	public double calculatePremium() {
		double premium=0;
		if(this.age<25) {
			premium=0.6*this.insuredAmount;
		}else {
			premium=0.7*this.insuredAmount;
		}
		return premium;
	}
	
	
}
