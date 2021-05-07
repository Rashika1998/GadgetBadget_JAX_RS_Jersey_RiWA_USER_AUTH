package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginAPI") 
public class AuthAPI extends HttpServlet  {
	
	
	User userObj = new User();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		 HttpSession session = request.getSession(); 
		 String authStatus = userObj.login(request.getParameter("txtUsername"), 
		 request.getParameter("txtPassword")); 
		 String output = ""; 
		if (authStatus.equals("success")) 
		 { 
			 output = "{\"status\":\"success\", \"data\": \"\"}"; 
			 session.setAttribute("Username", 
			 request.getParameter("txtUsername"));
		 } 
		else
		 { 
			output = "{\"status\":\"error\", \"data\": \"" + authStatus + "\"}"; 
		 }
		
		 response.getWriter().write(output); 
	}
	
	
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
				 HttpSession session = request.getSession(); 
				session.invalidate(); 
				response.getWriter().write("success"); 
	}

}
