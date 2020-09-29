package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Invoice;

public interface InvoiceDAO {

	Collection<Invoice> findAll();
	Collection<Invoice> sortedBy(String propName);
	Collection<Invoice> sortedByInvoiceNumber();
	Collection<Invoice> sortedListByInvoiceNumber();
	boolean add(Invoice entity);
	boolean add (Invoice ...invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice oldElement,Invoice newElement);
	
	
}