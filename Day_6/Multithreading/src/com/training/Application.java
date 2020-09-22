package com.training;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		new InvokeNumberService(100, "Hundred Count");
		new InvokeNumberService(1000, "Thounsand Count");
		new InvokeNumberService(10000, "Ten Thousand Count");
		
		try {
			System.out.println("Enter a Message");
			int key=System.in.read();
			System.out.println(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
