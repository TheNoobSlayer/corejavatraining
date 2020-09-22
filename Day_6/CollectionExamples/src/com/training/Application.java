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
		Invoice ram=new Invoice(101, "Ramesh", 4500);
		Invoice raj=new Invoice(102, "Rajesh", 5500);
		Invoice rak=new Invoice(103, "Rakesh", 5500);
		Invoice kam=new Invoice(104, "Kamesh", 6500);
		Invoice pam=new Invoice(105, "Pamesh", 6500);
		
		InvoiceDAO dao=new InvoiceDaoImpl();
		dao.add(ram);
		dao.add(raj,rak,kam);
		
		Collection<Invoice> invList=dao.findAll();
		printList(invList);
		dao.remove(kam);
		System.out.println("After deletion");
		printList(invList);
		dao.update(rak, pam);
		System.out.println("After Updation");
		printList(invList);
		
	}

}
