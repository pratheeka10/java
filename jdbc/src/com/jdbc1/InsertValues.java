package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement s = con.createStatement();
		s.executeUpdate("insert into employee values(101,'Reshma',26,23000)");
		s.executeUpdate("insert into employee values(102,'Sakshi',23,25000)");
		s.executeUpdate("insert into employee values(103,'John',24,27000)");
		s.executeUpdate("insert into employee values(104,'Cherry',28,30000)");
		s.executeUpdate("insert into employee values(105,'Jenifer',26,21000)");
		s.executeUpdate("insert into employee values(106,'Rejoce',28,28000)");
		System.out.println("Data inserted into the table...");
		
		
		
		

	}

}
