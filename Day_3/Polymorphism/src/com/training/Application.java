package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lawyer rajesh=new Lawyer(494949,"Rajesh Khanna","SupremeCourt","B.L");
		Musician sharma=new Musician(232323,"Umesh Khanna","Tabla","Allahabad");
		
		Billing bill=new Billing();
		bill.printFees(sharma);
		bill.printFees(rajesh);
		WrapperAndStatic obj=new WrapperAndStatic();
		obj.parseStrNumber("12345");
		System.out.println(obj.useStrNumber(5622).length());
		System.out.println(obj.useValueOf());
	}

}
