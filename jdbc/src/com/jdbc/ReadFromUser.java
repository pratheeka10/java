package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadFromUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
//    	PreparedStatement ps = con.prepareStatement("select name from student where id=?");
//    	System.out.println("Enter the student id...");
//    	int id = sc.nextInt();
//    	ps.setInt(1, id);
//    	ResultSet rs = ps.executeQuery();
//    	while(rs.next())
//    	{
//    		System.out.println(rs.getString(1));
//    	}
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		for(int i = 1;i<=1;i++)
		{
			System.out.println("Enter student id:");
			int id = sc.nextInt();
			System.out.println("Enter student name:");
			String name = sc.next();
			System.out.println("Enter student phno:");
			long phno = sc.nextLong();
			System.out.println("Enter student email:");
			String email = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setLong(3, phno);
			ps.setString(4, email);
			
			ps.executeUpdate();
			
		}
    	

	}

}
