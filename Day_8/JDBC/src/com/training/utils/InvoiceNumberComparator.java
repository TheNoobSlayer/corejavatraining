package com.training.util;

import java.util.Comparator;

import com.training.entity.Invoice;

public class InvoiceNumberComparator implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
		// TODO Auto-generated method stub
		if(o1.getInvoiceNumber()>o2.getInvoiceNumber()) {
			return 1;
		}else if(o1.getInvoiceNumber()<o2.getInvoiceNumber()) {
			return -1;
		}else {
			return 0;
		}
		
	}

	

}