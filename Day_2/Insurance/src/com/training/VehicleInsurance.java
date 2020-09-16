package com.training;

public class VehicleInsurance extends Insurance {
	
	private int vehicleModel;
	private int yearOfModel;
	private int costOfVehicle;
	public VehicleInsurance(int policyNumber, String policyHolderName, int age,int insuredAmount, int vehicleModel, int yearOfModel,
			int costOfVehicle) {
		super(policyNumber, policyHolderName, age,insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfModel = yearOfModel;
		this.costOfVehicle = costOfVehicle;
	}
	public int getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfModel() {
		return yearOfModel;
	}
	public void setYearOfModel(int yearOfModel) {
		this.yearOfModel = yearOfModel;
	}
	public int getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(int costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=0.0f;
		if(this.vehicleModel==2) {
			if(2020-this.yearOfModel<2) {
				premium=0.5*this.getInsuredAmount();
			}else {
				premium=0.6*this.getInsuredAmount();
			}
		}else if(this.vehicleModel==4) {
			if(2020-this.yearOfModel<2) {
				premium=0.4*this.getInsuredAmount();
			}else {
				premium=0.5*this.getInsuredAmount();
			}
		}
		return super.calculatePremium();
	}
	
	
	
}
