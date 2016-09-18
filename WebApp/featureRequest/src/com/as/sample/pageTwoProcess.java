package com.as.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageTwoProcess
 */
public class pageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
	   String cl = request.getParameter("Client");
	   System.out.println("The client  name is " + cl);
	   request.getSession().setAttribute("Client", cl);
	   
	   response.sendRedirect("jsp/printOne.jsp");
	}

}
