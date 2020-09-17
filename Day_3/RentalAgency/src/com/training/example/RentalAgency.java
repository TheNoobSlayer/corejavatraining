package com.training.example;

import com.training.ifaces.Product;
public class RentalAgency {
	
	
	
	public Product getProduct(int key) {
		switch(key) {
		case 1:
			return new Computer();
		case 2:
			return new Furniture();
		default:
			return null;
		
		}
	}
	
	public void printEstimate(Product polyProduct) {
		System.out.println(polyProduct.APPNAME);
		System.out.println(polyProduct.getColor());
		System.out.println(polyProduct.getModel());
		System.out.println(polyProduct.getPrice());
	}
	
	public int getPerDayRent(Product polyProduct) {
		int totalRent = 0;
		totalRent+= polyProduct.perDayRent();
		return totalRent;
	}
	public String getName(Product polyProduct) {
		return polyProduct.getModel();
	}
}
