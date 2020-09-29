package com.training;
import java.sql.*;

import com.training.utils.ConnectionUtility;

public class UsingTransactions {
	
	public static void main(String[] args) {
		
		Connection con = ConnectionUtility.getDerbyConnection();
		Savepoint point1 = null;
		
		try {
			con.setAutoCommit(false);
			
			String sqlOne = "insert into invoice values(?,?,?)";
			String sqlTwo = "inseert into invoice values(?,?,?)";
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			
			
			int rowUpdated = 0;
			
			
				pstmt = con.prepareStatement(sqlOne);
				
				pstmt.setInt(1, 875);
				pstmt.setString(2, "Rock");
				pstmt.setDouble(3, 4942);
				
				pstmt.executeUpdate();
				
				point1 = con.setSavepoint("point1");
				
				
				pstmt2 = con.prepareStatement(sqlTwo);
				
				pstmt2.setInt(1, 96);
				pstmt2.setString(2, "Loke");
				pstmt2.setDouble(3, 5949);
				
				pstmt2.executeUpdate();
				
				con.commit();
			
				
		}catch(SQLException e) {
			
		
		try {
			con.rollback(point1);
			con.commit();
			System.out.println("Rolling back");
		} 
		catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		}
	}

}