package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
		Statement s = con.createStatement();
//		ResultSet rs = s.executeQuery("select * from student");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4));
//		}
//		ResultSet rs = s.executeQuery("select id,name from student");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+"    "+rs.getString(2));
//		}
//		
		ResultSet rs = s.executeQuery("select name,phone from student where id=3");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"   "+rs.getLong(2));
		}
		
	}
	

}
