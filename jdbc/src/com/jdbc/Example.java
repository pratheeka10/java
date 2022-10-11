package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
		Statement s = con.createStatement();
		//s.executeUpdate("create database mangalore");
		s.executeUpdate("create table student(id integer,name varchar(20),phone long,email varchar(20))");
		System.out.println("Table created");

	}

}
