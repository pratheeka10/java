package com.hcl.hibernate_customer_crud_controller;

import java.util.Scanner;

import com.hcl.hibernate_customer_crud.Customer;
import com.hcl.hibernate_customer_crud_dao.CustomerDao;

public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer c;
		CustomerDao cd = new CustomerDao();
		while(true) {
			System.out.println("1. SaveCustomer");
			System.out.println("2. UpdateCustomer");
			System.out.println("3. DeleteCustomer");
			System.out.println("4. AllCustomerData");
			System.out.println("5. GetCustomerById");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				c = new Customer();
				System.out.println("Enter the customerName");
				c.setName(sc.next());
				System.out.println("Enter the customerEmail");
				c.setEmail(sc.next());
				cd.saveCustomer(c);
			}
			case 2:{
				System.out.println("Enter the customer Id");
				int id = sc.nextInt();
				System.out.println("Enter the customer Name");
				String name = sc.next();
				System.out.println("Enter the customer Email");
				String email = sc.next();
				cd.updateById(id,name,email);
			}
			case 3:{
				System.out.println("Enter the customer Id");
				int id = sc.nextInt();
				cd.deleteById(id);
			}
			case 4:{
				c = new Customer();
				cd.getAllData();
			}
			case 5:{
				System.out.println("Enter the customer Id");
				int id = sc.nextInt();
				cd.getCustomerById(id);
			}
			}
		}

	}

}
