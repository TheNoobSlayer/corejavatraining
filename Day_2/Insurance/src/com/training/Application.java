package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance holderOne=new Insurance(123,"Aditya",10,5000);
		double premiumCalculated=holderOne.calculatePremium();
		System.out.println(holderOne.getPolicyHolderName()+"'s insured amount ="+premiumCalculated);
		
		Insurance holderTwo=new Insurance(456,"Bob",70,7000);
		premiumCalculated=holderTwo.calculatePremium();
		System.out.println(holderTwo.getPolicyHolderName()+"'s insured amount ="+premiumCalculated);
		
		VehicleInsurance holderThree=new VehicleInsurance(789,"Aditya",10,9000,2,2010,1000000);
		premiumCalculated=holderThree.calculatePremium();
		System.out.println(holderThree.getPolicyHolderName()+"'s insured amount for "+holderThree.getVehicleModel()+" wheeler="+premiumCalculated);
		
		VehicleInsurance holderFour=new VehicleInsurance(789,"Aditya",10,8000,4,2019,1000000);
		premiumCalculated=holderFour.calculatePremium();
		System.out.println(holderFour.getPolicyHolderName()+"'s insured amount for "+holderFour.getVehicleModel()+" wheeler="+premiumCalculated);
	
	}

}
