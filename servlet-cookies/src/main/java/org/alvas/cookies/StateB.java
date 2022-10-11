package org.alvas.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/stateb")
public class StateB extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie [] cookies = request.getCookies();
		
		PrintWriter pw = response.getWriter();
		
		for(Cookie cookie : cookies) {
			if(cookie.getValue() != null) {
				String str = "<html><body><h1>Welcome to My cookie "+cookie.getName()+" "+cookie.getValue()+"</h1></body></html>";
				pw.append(str);
			}
			
		}
	}

}
