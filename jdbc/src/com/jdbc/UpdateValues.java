package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangalore","root","root");
//		Statement s = con.createStatement();
//		s.executeUpdate("update student set name='gayathri' where id=5");
//		System.out.println("Updation sucessfull...");
		PreparedStatement ps = con.prepareStatement("update student set phone=7890654321 where id=?");
		System.out.println("Enter the student id u want to update...");
    	int id = sc.nextInt();
        ps.setInt(1, id);
    	
    	ps.executeUpdate();

	}

}
