package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Student;
import com.training.services.StudentServiceImpl;
import com.training.utils.MyGsonParser;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studentId=request.getParameter("studentId");
		int id=Integer.parseInt(studentId);
		//System.out.println(id);
		PrintWriter out=response.getWriter();
		response.setContentType("application/json");
		
		
		//out.println("<h1>Using JSON</h1>");
		
		StudentServiceImpl service=new StudentServiceImpl();
		Student student=service.findById(id);
		//HashMap<Integer,Student> allStudent=service.findAll();
		MyGsonParser parser=new MyGsonParser();
		String jsonResp=parser.transformToGson(student);
		out.println(jsonResp);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside POST");
		String studentId=request.getParameter("studentId");
		String studentName=request.getParameter("studentName");
		StudentServiceImpl service=new StudentServiceImpl();
		Student student=service.findById(Integer.parseInt(studentId));
		PrintWriter out=response.getWriter();
		response.setContentType("application/json");
		

		MyGsonParser parser=new MyGsonParser();
		String jsonResp=parser.transformToGson(student);
		out.println(jsonResp);
	}

}
