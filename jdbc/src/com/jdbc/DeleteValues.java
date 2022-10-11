package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
//		Statement s = con.createStatement();
//		s.executeUpdate("delete from student where id=2");
//		System.out.println("Student data deleted...");
		
		PreparedStatement ps = con.prepareStatement("delete from student where id=?");
    	System.out.println("Enter the student id u want to delete...");
    	int id = sc.nextInt();
    	ps.setInt(1, id);
    	
    	ps.executeUpdate();

	}

}
