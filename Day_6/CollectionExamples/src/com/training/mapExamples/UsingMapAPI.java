package com.training.mapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.entity.Invoice;

public class UsingMapAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice adi=new Invoice(102, "Aditya", 4500);
		Invoice bo=new Invoice(104, "Bo", 5500);
		Invoice chinu=new Invoice(101, "Chinu", 5500);
		Invoice doke=new Invoice(105, "Doke", 6500);
		Invoice esh=new Invoice(104, "Eshwar", 6500);
		
		HashMap<Integer,Invoice> invList=new HashMap<>();
		invList.put(901, adi);
		invList.put(902, bo);
		Invoice response=invList.put(902, doke);
		invList.put(903, chinu);
		
		System.out.println(response);
		System.out.println("Size= "+invList.size());
		System.out.println(invList);
		
		Set<Map.Entry<Integer,Invoice>> myList=invList.entrySet();
		
		for(Map.Entry<Integer, Invoice> eachEntry:myList) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
	}

}
