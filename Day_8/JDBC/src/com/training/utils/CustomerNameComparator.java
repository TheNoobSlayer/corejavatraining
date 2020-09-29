package com.training.util;

import java.util.Collections;
import java.util.Comparator;

import com.training.entity.Invoice;

public class CustomerNameComparator implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
		// TODO Auto-generated method stub
		
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

}