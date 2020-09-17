package com.training;

public class Billing {
	public void printFees(ServiceProvider provider) {
		System.out.println(provider.calculateFees());
	}
}
