package com.training.setExamples;

import java.util.HashSet;

import com.training.entity.Invoice;
import com.training.util.InvoiceNumberComparator;

public class UsingSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice adi=new Invoice(104, "Aditya", 4500);
		Invoice bo=new Invoice(104, "Bo", 5500);
		Invoice chinu=new Invoice(101, "Chinu", 5500);
		Invoice doke=new Invoice(105, "Doke", 6500);
		Invoice esh=new Invoice(104, "Eshwar", 6500);
		
		HashSet<Invoice> hashSet=new HashSet<>();
		hashSet.add(adi);
		hashSet.add(bo);
		hashSet.add(chinu);
		hashSet.add(doke);
		hashSet.add(esh);
		hashSet.add(esh);
		for(Invoice eachInvoice:hashSet) {
			System.out.println(eachInvoice);
		}
	}

}
