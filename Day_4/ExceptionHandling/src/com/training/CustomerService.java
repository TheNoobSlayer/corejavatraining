package com.training;

public class CustomerService {
	
	public String generateUserId(Customer cust) {
		try {
			int firstPart=Integer.parseInt(cust.getCustomerId());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("CustomerId should be a number");
			e.printStackTrace();
		}
		return "";
	}
	public void printCustomer(Customer cust) {
		
		try {
			System.out.println(cust.getCustomerName().length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Customer name is compulsory");
			e.printStackTrace();
			
		}
		System.out.println("Outside catch block");
	}
	
	public String encryptEmail(Customer cust) {
		String email=cust.getEmail();
		boolean status=email.contains("@");
		String encrypted="";
		
		if(!status) {
			try {
				throw new Exception("Invalid email id");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("Inside Catch");
				return "";
			}finally {
				System.err.println("Inside finally block");
			}
			
			
		}else {
			encrypted="abcde"+email+"!4341@";
		}
		return encrypted;
	}
}
