package com.as.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageOneProcess
 */
public class pageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   String title = request.getParameter("title");
	   String descript = request.getParameter("descript");
	   String client = request.getParameter("client");
	   String clientPrior = request.getParameter("clientPrior");
	   String targetDate = request.getParameter("targetDate");
	   String productArea = request.getParameter("productArea");
	   
	   System.out.println("The Title is " +title );
	   System.out.println("The description is " +descript );
	   System.out.println("The client is " +client );
	   System.out.println("The Priority is " +clientPrior );
	   System.out.println("The date is " +targetDate );
	   System.out.println("The Title is " +title );
	   System.out.println("The Product Area is " +productArea );
	   
	   request.getSession().setAttribute("title", title);
	   request.getSession().setAttribute("descript", descript);
	   request.getSession().setAttribute("client", client);
	   request.getSession().setAttribute("clientPrior", clientPrior);
	   request.getSession().setAttribute("targetDate", targetDate);
	   request.getSession().setAttribute("productArea", productArea);
	  
	   response.sendRedirect("html/pageTwo.html");
		
   }

}
