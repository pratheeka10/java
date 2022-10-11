package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		for(int i=1;i<=1;i++)
		{
			System.out.println("Enter employee id:");
			int id = sc.nextInt();
			System.out.println("Enter employee name:");
			String name = sc.next();
			System.out.println("Enter employee age:");
			int age = sc.nextInt();
			System.out.println("Enter employee salary:");
			float salary = sc.nextFloat();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setFloat(4, salary);
			
			ps.executeUpdate();
			
		}
		
		

	}

}
