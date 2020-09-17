package com.training.example;

import com.training.ifaces.Product;

public class Furniture implements Product {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "GS-734";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 19000;
	}

	@Override
	public int perDayRent() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
