package com.training.dao;

import java.util.*;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.util.CustomerNameComparator;
import com.training.util.InvoiceNumberComparator;

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
		for(Invoice eachInvoice:this.invList) {
			if(eachInvoice.getInvoiceNumber()==id) {
				return eachInvoice;
			}
		}
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

	@Override
	public Collection<Invoice> sortedByInvoice() {
		// TODO Auto-generated method stub
		Collections.sort(this.invList);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		// TODO Auto-generated method stub
		InvoiceNumberComparator numComparator=new InvoiceNumberComparator();
		Collections.sort(this.invList,numComparator);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedByCustomerName() {
		// TODO Auto-generated method stub
		CustomerNameComparator nameComparator=new CustomerNameComparator();
		Collections.sort(this.invList,nameComparator);
		return this.invList;
	
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		// TODO Auto-generated method stub
		if(propName.equalsIgnoreCase("Customer Name")) {
			return this.sortedByCustomerName();
		}else if(propName.equalsIgnoreCase("Invoice Number")) {
			return this.sortedByInvoiceNumber();
		}
		return null;
		
	}

	

}
