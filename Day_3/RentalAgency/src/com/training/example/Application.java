package com.training.example;

import java.util.Scanner;
import java.util.*;
import com.training.ifaces.Product;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalBill = 0;
		ArrayList<String> cart=new ArrayList<String>();
		int key;
		
		RentalAgency saiAccesories=new RentalAgency();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("What do you wish to buy?");
			System.out.println("1: Computer");
			System.out.println("2: Furniture");
			key=sc.nextInt();
			
			Product selected=saiAccesories.getProduct(key);
			if(selected!=null) {
				
				System.out.println("For how many days? ");
				int noOfdays=sc.nextInt();
				
				System.out.println("How many of them? ");
				int quantity=sc.nextInt();
				
				saiAccesories.printEstimate(selected);
				for(int i=0;i<quantity;i++) {
					cart.add(saiAccesories.getModel(selected));
				}
				
				totalBill=totalBill+saiAccesories.getPerDayRent(selected,noOfdays,quantity);
				
			}else {
				System.out.println("Wrong Option. Should be 1 or 2 and 0 to exit");
			}
			
			System.out.println("Keep Buying?");
			System.out.println("1: Yes");
			System.out.println("0: No");
			int exit=sc.nextInt();
			
			if(exit==0) {
				break;
			}
		}
		System.out.print("Cart= ");
		for(String product:cart) {
			System.out.print(product+", ");
		}
		System.out.println();
		System.out.println("Total Bill ="+totalBill);
		sc.close();

	}

}
