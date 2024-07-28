package com.cookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet1
 */
public class servlet1 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
		response.setContentType("text/html");
		try (PrintWriter outPrintWriter = response.getWriter()){
			outPrintWriter.println("<!DOCTYPE html");
			outPrintWriter.println("<html>");
			outPrintWriter.println("<head>");
			outPrintWriter.println("<title>Servlet S1</title>");
			outPrintWriter.println("</head>");
			outPrintWriter.println("<body>");
			
			// fetching name from request
			String userNameString = request.getParameter("name");
			outPrintWriter.println("Hello! " + userNameString + " Welcome to Servlet 1");
			
			// go to servlet 2
			outPrintWriter.println("<br><a href='servlet2'>Go to Servlet2</a>");
			
			// adding cookie
			Cookie cookie = new Cookie("username", userNameString);
			response.addCookie(cookie);
			
			outPrintWriter.println("</body>");
			outPrintWriter.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
}
