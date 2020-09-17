package com.training.example;

import java.util.Scanner;

import com.training.ifaces.Product;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentalAgency saiAccesories=new RentalAgency();
		int totalBill = 0;
		String productsBought = "";
		int key;
		Scanner sc=new Scanner(System.in);
		while(true){
			key=sc.nextInt();
			if(key==0) {
				break;
			}
			Product selected=saiAccesories.getProduct(key);
			if(selected!=null) {
				saiAccesories.printEstimate(selected);
				totalBill+= saiAccesories.getPerDayRent(selected);
				productsBought+= saiAccesories.getName(selected)+", ";
			}else {
				System.out.println("Wrong Option. Should be 1 or 2 and 0 to exit");
			}
		}
		System.out.println("Products bought ==>"+productsBought);
		System.out.println("Total Bill ==> "+totalBill);
		sc.close();

	}

}
