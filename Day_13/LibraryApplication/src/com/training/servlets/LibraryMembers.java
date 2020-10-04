package com.training.servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.MemberDAOImpl;
import com.training.entity.Member;

/**
 * Servlet implementation class LibraryMembers
 */
@WebServlet("/LibraryMembers")
public class LibraryMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static long memberId=110; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibraryMembers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Post");
		String memberName=request.getParameter("memberName");
		String date=request.getParameter("openingDate");
		String membershipType=request.getParameter("membershipType");
		Double feesPaid=Double.valueOf(request.getParameter("feesPaid"));
		Double penalty=Double.valueOf(request.getParameter("penalty"));
		MemberDAOImpl service=new MemberDAOImpl();
		Member newMember=new Member(memberId++, memberName, Date.valueOf(date).toLocalDate(), membershipType, feesPaid, 2,penalty );
		try {
			boolean result=service.add(newMember);
			if(result) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("/success.html");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher=request.getRequestDispatcher("/failure.html");
				dispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
