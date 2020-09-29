package com.training;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.ConnectionUtility;

public class Application {

	public static void main(String[] args) {
	
////		System.out.println(ConnectionUtility.getDerbyConnection());
////		
//		Invoice ram = new Invoice(102, "Bo", 50000.0);
		InvoiceDAO dao = new InvoiceDaoImpl();
//		
//		boolean result = dao.add(ram);
////		
//		System.out.println(result);
////		
//		if(result) {
//		System.out.println("ROW ADDED");
//		}
//		
		System.out.println(dao.findAll()+"\n");
		
		
		
	
//		System.out.println(dao.findById(101));

	}

}