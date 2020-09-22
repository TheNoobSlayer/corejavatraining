package com.training.ifaces;

import java.util.Collection;

import com.training.entity.*;

public interface InvoiceDAO {
	
	Collection<Invoice> findAll();
	boolean add(Invoice entity);
	boolean add(Invoice ...invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice oldElement,Invoice newElement);
}
