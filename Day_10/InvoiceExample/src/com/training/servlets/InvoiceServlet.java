package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

/**
 * Servlet implementation class InvoiceServlet
 */
@WebServlet(urlPatterns= {"/addInvoice","/InvoiceServlet"})
public class InvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceServlet() {
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
		String customerName=request.getParameter("customerName");
		
		String invoiceNumber=request.getParameter("invoiceNumber");
		int parsedInvoiceNumber=Integer.parseInt(invoiceNumber);
		
		String amount=request.getParameter("amount");
		int parsedAmount=Integer.parseInt(amount);
		
		Invoice newInvoice=new Invoice(parsedInvoiceNumber,customerName,parsedAmount);
		InvoiceDAO dao = new InvoiceDaoImpl();
		boolean result=dao.add(newInvoice);
		
		if(result) {
			request.setAttribute("customerName", customerName);
			request.setAttribute("invoiceNumber", invoiceNumber);
			request.setAttribute("amount", amount);
			RequestDispatcher dispatcher=request.getRequestDispatcher("/success.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("/failure.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
