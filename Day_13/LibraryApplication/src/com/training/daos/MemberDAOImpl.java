package com.training.daos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import com.training.entity.Member;
import com.training.ifaces.MemberDAO;
import com.training.utils.ConnectionUtility;
import com.training.utils.PenaltyComparator;

public class MemberDAOImpl implements MemberDAO<Member> {
	private ArrayList<Member> memberList=null;
	private Connection derbyConnection;
	public MemberDAOImpl() {
		super();
		this.derbyConnection=ConnectionUtility.getDerbyConnection();
		this.memberList=new ArrayList<Member>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Member t) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into members values(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = null;
		
		int rowUpdated = 0;
		Date date=Date.valueOf(t.getAccountOpeningDate());
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, (int)t.getMemberId());
			pstmt.setString(2, t.getMemberName());
			pstmt.setDate(3, date);
			pstmt.setString(4, t.getMembershipType());
			pstmt.setDouble(5, t.getFeesPaid());
			pstmt.setInt(6, t.getMaxBookAllowed());
			pstmt.setDouble(7, t.getPenaltyAmount());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		return rowUpdated==1 ? true:false;

	}

	@Override
	public Member findById(long id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from members where memberid=?";
		
		PreparedStatement pstmt = null;
		
		Member member = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			pstmt.setInt(1, (int)id);
			ResultSet result = pstmt.executeQuery();
			//result = result.next();
			
			
			while(result.next()) {
				
				member = printResult(result);
				
			}
			
			return member;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return member;
	
	}

	@Override
	public ArrayList<Member> findAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from members";
		
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
			
				long memberId = result.getInt("memberId");
				String memberName = result.getString("memberName");
				LocalDate date=result.getDate("accountOpeningDate").toLocalDate();
				String membershipType=result.getString("membershipType");
				Double feesPaid=result.getDouble("feesPaid");
				int maxBookAllowed=result.getInt("maxBookAllowed");
				double penaltyAmount=result.getDouble("penaltyAmount");
				
				Member member = new Member(memberId,memberName,date,membershipType,feesPaid,maxBookAllowed,penaltyAmount);
				
				this.memberList.add(member);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.memberList;
	}

	@Override
	public boolean update(Member t) throws SQLException {
		// TODO Auto-generated method stub
		int index = 0;
		int result = 0;
		Date date=Date.valueOf(t.getAccountOpeningDate());
		String sql = "update members set memberId = ? , memberName = ? , accountOpeningDate = ?, membershipType = ? , feesPaid = ? , maxBookAllowed = ? , penaltyAmount = ? where memberId = ?";
		
		PreparedStatement pstmt = null;
		
		Member member = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, (int)t.getMemberId());
			pstmt.setString(2, t.getMemberName());
			pstmt.setDate(3, date);
			pstmt.setString(4, t.getMembershipType());
			pstmt.setDouble(5, t.getFeesPaid());
			pstmt.setInt(6, t.getMaxBookAllowed());
			pstmt.setDouble(7, t.getPenaltyAmount());
			
			pstmt.setInt(8, (int)t.getMemberId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(this.invList.contains(oldEntity)) {
//			index = this.invList.indexOf(oldEntity);
//			this.invList.set(index, newEntity);
//			result = true;
//		}
		return result == 1 ? true : false;
	}

	@Override
	public Member delete(long id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from members where memberId = ?";
		
		java.sql.PreparedStatement pstmt = null;
		
		int result = 0;
		
		Member member=null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, (int)id);
			
			member = this.findById(id);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public ArrayList<Member> getPenaltyList() {
		// TODO Auto-generated method stub
		String sql = "select * from members where penaltyAmount>0";
		ArrayList<Member> penaltyList=new ArrayList<Member>();
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
			
				long memberId = result.getInt("memberId");
				String memberName = result.getString("memberName");
				LocalDate date=result.getDate("accountOpeningDate").toLocalDate();
				String membershipType=result.getString("membershipType");
				Double feesPaid=result.getDouble("feesPaid");
				int maxBookAllowed=result.getInt("maxBookAllowed");
				double penaltyAmount=result.getDouble("penaltyAmount");
				
				Member member = new Member(memberId,memberName,date,membershipType,feesPaid,maxBookAllowed,penaltyAmount);
				
				penaltyList.add(member);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(penaltyList, new PenaltyComparator());
		return penaltyList;
	}
	
	private Member printResult(ResultSet result) {
		
		Member member = null;
		try {
			long memberId = (long)result.getInt("memberId");
			String memberName = result.getString("memberName");
			LocalDate date=result.getDate("accountOpeningDate").toLocalDate();
			String membershipType=result.getString("membershipType");
			Double feesPaid=result.getDouble("feesPaid");
			int maxBookAllowed=result.getInt("maxBookAllowed");
			double penaltyAmount=result.getDouble("penaltyAmount");
			member = new Member(memberId,memberName,date,membershipType,feesPaid,maxBookAllowed,penaltyAmount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

}
