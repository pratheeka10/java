package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
		Statement s = con.createStatement();
		s.executeUpdate("insert into student values(1,'ram',987654321,'ram@gmail.com')");
		s.executeUpdate("insert into student values(2,'ramya',987654001,'ramya@gmail.com')");
		s.executeUpdate("insert into student values(3,'shifali',980054321,'shif@gmail.com')");
		s.executeUpdate("insert into student values(4,'shravya',987600321,'shrav@gmail.com')");
		s.executeUpdate("insert into student values(5,'preeth',987054321,'preet@gmail.com')");
		System.out.println("Values inserted...");

	}

}
