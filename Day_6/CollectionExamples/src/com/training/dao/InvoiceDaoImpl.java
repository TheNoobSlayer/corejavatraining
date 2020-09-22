package com.training.dao;

import java.util.*;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

public class InvoiceDaoImpl implements InvoiceDAO {
	
	private List<Invoice> invList;
	

	public InvoiceDaoImpl() {
		super();
		this.invList=new ArrayList<Invoice>();
	}

	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invList.add(entity);
	}

	@Override
	public Invoice findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Invoice... invoices) {
		// TODO Auto-generated method stub
		boolean result=false;
		for(Invoice eachInvoice: invoices) {
			add(eachInvoice);
			result=true;
		}
		return result;
	}

	@Override
	public boolean remove(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invList.remove(entity);
	}

	@Override
	public boolean update(Invoice oldElement, Invoice newElement) {
		// TODO Auto-generated method stub
		int index=this.invList.indexOf(oldElement);
		if(index!=-1) {
			this.invList.set(index, newElement);
			return true;
		}
		
		return false;
	}

	

}
