package com.training;

import java.util.Collection;
import java.util.Iterator;

import com.training.dao.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

public class Application {

	public static void printList(Collection<Invoice> invList) {
		Iterator<Invoice> iterator=invList.iterator();
		while(iterator.hasNext()) {
			Invoice inv=iterator.next();
			System.out.println(inv);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice adi=new Invoice(102, "Aditya", 4500);
		Invoice bo=new Invoice(104, "Bo", 5500);
		Invoice chinu=new Invoice(101, "Chinu", 5500);
		Invoice doke=new Invoice(105, "Doke", 6500);
		Invoice esh=new Invoice(104, "Eshwar", 6500);
		
		InvoiceDAO dao=new InvoiceDaoImpl();
		dao.add(doke);
		dao.add(adi,esh,chinu,bo);
		
		
		System.out.println("Using findById");
		System.out.println(dao.findById(102));
		
		System.out.println("Sorted by Customer Name");
		printList(dao.sortedBy("Customer Name"));
		System.out.println("Sorted by Invoice Number");
		printList(dao.sortedBy("Invoice Number"));
		
	}

}
