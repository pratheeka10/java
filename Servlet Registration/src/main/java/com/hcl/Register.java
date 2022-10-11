package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String c=request.getParameter("userCountry"); 
		out.println("<h1>Information stored sucessfully!!!</h1>");
		out.println(n);
		out.println(p);
		out.println(e);
		out.println(c);
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/registration","root","root");  
			  
			PreparedStatement ps=con.prepareStatement(  
			"insert into registeruser values(?,?,?,?)");  
			  
			ps.setString(1,e);  
			ps.setString(2,n);  
			ps.setString(3,p);  
			ps.setString(4,c);  
			          
			int i=ps.executeUpdate();  
			if(i>0)  
			out.print("You are successfully registered...");  
			      
			          
			}catch (Exception e2) {
				System.out.println(e2);
				}  
			          
			out.close();  
	}

}
