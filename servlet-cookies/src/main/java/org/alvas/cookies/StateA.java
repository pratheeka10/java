package org.alvas.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/statea")
public class StateA extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		
		Cookie cookie = new Cookie("myName",name);
		
		response.addCookie(cookie);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/stateb");
		
		dispatcher.forward(request, response);
		
	}

}
