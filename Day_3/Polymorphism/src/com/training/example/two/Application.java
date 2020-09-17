package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom saiCars=new NewShowroom();
		int key;
		Scanner sc=new Scanner(System.in);
		while(true){
			key=sc.nextInt();
			if(key==0) {
				break;
			}
			Automobile selected=saiCars.getProduct(key);
			if(selected!=null) {
				saiCars.printEstimate(selected);
			}else {
				System.out.println("Wrong Option. Should be 1 or 2");
			}
		}
		sc.close();
		
		
	}

}
