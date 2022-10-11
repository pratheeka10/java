package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement s = con.createStatement();
		//s.executeUpdate("create database company");
		s.executeUpdate("create table employee(eid integer,ename varchar(20),age integer,salary float)");
		System.out.println("Table created");

	}

}
