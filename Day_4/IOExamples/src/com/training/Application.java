package com.training;

import java.io.File;

public class Application {
	public static void main(String args[]) {
		
		Customer ramesh=new Customer("456","Bo",949494,"ram@abc.com");
		
		FileExamples service =new FileExamples();
		service.writeToFile(new File("Customer.txt"), ramesh);
		service.readFromFile(new File("Customer.txt"));
		System.out.println("Done");
		
	}
}
