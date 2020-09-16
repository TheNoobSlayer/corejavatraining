package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv=new Product(1010,"LED TV",23000.00,3);
		ManageProduct mgr=new ManageProduct();
		double discount=mgr.calculateDiscount(tv);
		int tax=mgr.calculateTax(tv);		
		System.out.println("Discount:==>"+discount);
		System.out.println("Tax:==>"+tax);
		Product fridge=new Product();
		fridge.setProductId(200);
		fridge.setProductName("Fridge");
	}

}
