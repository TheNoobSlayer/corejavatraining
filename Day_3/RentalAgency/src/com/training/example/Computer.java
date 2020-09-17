package com.training.example;
import com.training.ifaces.Product;
public class Computer implements Product {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "DELL 5577";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000;
	}

	@Override
	public int perDayRent() {
		// TODO Auto-generated method stub
		return 4000;
	}
	

}
