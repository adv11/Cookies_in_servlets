package com.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
		response.setContentType("text/html");
		try (PrintWriter outPrintWriter = response.getWriter()){
			outPrintWriter.println("<!DOCTYPE html");
			outPrintWriter.println("<html>");
			outPrintWriter.println("<head>");
			outPrintWriter.println("<title>Servlet S2</title>");
			outPrintWriter.println("</head>");
			outPrintWriter.println("<body>");
			
			// fetching cookie from response
			Cookie[] cookies = request.getCookies();
			String usernameString = null;
			
			if(cookies.length == 0) {
				outPrintWriter.println("<h1>You are a new user</h1>");
			}else {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equalsIgnoreCase("username")) {
						usernameString = cookie.getValue();
					}
				}
			}
			
			outPrintWriter.println("Hello! " + usernameString + " Welcome to Servlet 2");
			
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
