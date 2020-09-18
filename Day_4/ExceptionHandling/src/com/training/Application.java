package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Customer ram=new Customer();
			ram.setCustomerId("202");
			ram.setCustomerName("ram");
			ram.setEmail("ram@abc.com");
			ram.setMobileNumber(4949494);
			
			CustomerService service=new CustomerService();
			service.printCustomer(ram);
			
			Customer shyam=new Customer();
			shyam.setCustomerId("244");
			shyam.setCustomerName("ram");
			shyam.setEmail("shyam.com");
			shyam.setMobileNumber(4949494);
			service.printCustomer(shyam);
			System.out.println(service.generateUserId(shyam));
			System.out.println(service.encryptEmail(shyam));
			System.out.println(service.encryptEmail(ram));
		}catch (RangeCheckException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mobile number is invalid");
			e.printStackTrace();
		}
		
	}

}
