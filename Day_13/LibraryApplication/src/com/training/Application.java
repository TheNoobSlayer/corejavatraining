package com.training;

import java.sql.SQLException;
import java.time.LocalDate;

import com.training.daos.MemberDAOImpl;
import com.training.entity.Member;
import com.training.ifaces.MemberDAO;
import com.training.utils.ConnectionUtility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConnectionUtility.getDerbyConnection());
		//Member m=new Member(103, "Michael Jackson", LocalDate.parse("2020-01-08"), "Premium", 500.0, 2, 999.0);
		MemberDAOImpl libraryService=new MemberDAOImpl();
		try {
			//libraryService.add(o);
			for(Member eachMember:libraryService.getPenaltyList()) {
				System.out.println(eachMember);
			}
			//System.out.println(libraryService.update(m));
			for(Member eachMember:libraryService.findAll()) {
				System.out.println(eachMember);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
