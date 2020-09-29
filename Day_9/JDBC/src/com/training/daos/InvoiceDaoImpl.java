package com.training.daos;

import java.util.Collection;

import org.apache.derby.database.Database;

import java.sql.*;


import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.ConnectionUtility;
import com.training.utils.CustomerNameComparator;
import com.training.utils.InvoiceNumberComparator;

import java.util.*;
public class InvoiceDaoImpl implements InvoiceDAO {

	private List<Invoice> invList;
	
	private Connection derbyConnection;
	
	
	public InvoiceDaoImpl() {
		super();
		this.invList = new ArrayList<Invoice>();	
		
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
	}

	@Override
	public Collection<Invoice> findAll() {
		
		
		String sql = "select * from invoice";
		
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			ResultSet result = pstmt.executeQuery();
			
			ResultSetMetaData metaData = result.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			for(int i = 1; i<=columnCount; i++) {
				System.out.println("========= Columm:="+metaData.getColumnName(i));
			}
			
			DatabaseMetaData dbInfo = this.derbyConnection.getMetaData();
			
			System.out.println("Drvier Name:="+dbInfo.getDriverName());
			System.out.println("Product Version:="+dbInfo.getDatabaseProductVersion());
			
			while(result.next()) {
			
				int invoiceNumber = result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				Invoice inv = new Invoice(invoiceNumber,customerName,amount);
				
				this.invList.add(inv);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this.invList;
		
	}

	@Override
	public boolean add(Invoice entity) {
		
		String sql = "insert into invoice values(?,?,?)";
		
		PreparedStatement pstmt = null;
		
		int rowUpdated = 0;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, entity.getInvoiceNumber());
			pstmt.setString(2, entity.getCustomerName());
			pstmt.setDouble(3, entity.getAmount());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return rowUpdated==1 ? true:false;
	}

	@Override
	public Invoice findById(int id) {
		
		String sql = "select * from invoice where invoiceNumber=?";
		
		PreparedStatement pstmt = null;
		
		Invoice inv = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			ResultSet result = pstmt.executeQuery();
			System.out.println("check");
			System.out.println(result);
			//result = result.next();
			int invoiceNumber = result.getInt("invoiceNumber");
			String customerName = result.getString("customerName");
			double amount = result.getDouble("amount");
			
			inv = new Invoice(invoiceNumber,customerName,amount);
			
			return inv;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return inv;
	}

	@Override
	public boolean add(Invoice... invoices) {
		
		boolean result = false;
		
		for(Invoice eachInvoice : invoices) {
			add(eachInvoice);
			result = true;
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
	public Collection<Invoice> sortedListByInvoiceNumber() {
		// TODO Auto-generated method stub
		 Collections.sort(this.invList);
		 return this.invList;
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		if(propName.equalsIgnoreCase("customername")) {
			Collections.sort(this.invList,new CustomerNameComparator());
		}else if(propName.equalsIgnoreCase("invoicenumber")) {
			Collections.sort(this.invList,new InvoiceNumberComparator());
		}
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		Collections.sort(this.invList,new InvoiceNumberComparator());
		return this.invList;
	}
	
	private Invoice getInvoice(int Id) {
		String sql = "select * from invoice";
		
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
			
				int invoiceNumber = result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				Invoice inv = new Invoice(invoiceNumber,customerName,amount);
				
				this.invList.add(inv);
				return inv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}