package com.training.ifaces;

public interface Product {
	String APPNAME="Quotation Generation System";
	public abstract String getColor();
	public String getModel();
	double getPrice();
	int perDayRent();
}
