package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {
	
	public static Connection getDerbyConnection() {
		Connection derbyConnection=null;
		
		try {
			String derbyURL="jdbc:derby:SampleDB;create=true";
			derbyConnection=DriverManager.getConnection(derbyURL);
			if(derbyConnection!=null) {
				System.out.println("Connection Established");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return derbyConnection;
	}
	
}

