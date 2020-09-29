package com.training.entity;

import java.io.Serializable;

public class Invoice implements Serializable,Comparable<Invoice> {
	
	private static final long serialVersionUID=1L;
	
	private int invoiceNumber;
	private String customerName;
	private double amount;
	
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", amount=" + amount
				+ "]";
	}
	@Override
	public int compareTo(Invoice otherObj) {
		// TODO Auto-generated method stub
		if(this.invoiceNumber<otherObj.invoiceNumber) {
			return -1;
		}else if(this.invoiceNumber>otherObj.invoiceNumber) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}