package com.training;

public class Product {
	private int productId;
	private String productName;
	private double ratePerUnit;
	private int productType;
	private int quantity;
	private double discount;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public Product(int productId, String productName, double ratePerUnit, int productType, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
		this.quantity = quantity;
	}
	public Product(int productId, String productName, double ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Product(int productId, String productName, double ratePerUnit, int productType, int quantity, int discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
		this.quantity = quantity;
		this.discount = discount;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public Product(int productId, String productName, double ratePerUnit,int productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType=productType;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	
}
