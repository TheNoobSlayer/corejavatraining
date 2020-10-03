package com.training.utils;

import java.sql.*;

public class ConnectionUtility {

	@SuppressWarnings("deprecation")
	public static Connection getDerbyConnection() {
		
		Connection derbyConnection = null;
		
		try {
			
			String derbyURL = "jdbc:derby:LibraryDB;create=false";
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			derbyConnection = DriverManager.getConnection(derbyURL);
			
			Statement stmt;
			
			stmt=derbyConnection.createStatement();
			
			//String sql="create table members(memberId int primary key,memberName varchar(20),accountOpeningDate date,membershipType varchar(10),feesPaid double,maxBookAllowed int,penaltyAmount double)";
			
			//stmt.execute(sql);
			
			if(derbyConnection != null) {
				System.out.println("Connection Estabished");
				
			}else {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return derbyConnection;
	}
}