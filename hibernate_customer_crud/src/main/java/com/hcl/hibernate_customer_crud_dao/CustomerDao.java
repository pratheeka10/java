package com.hcl.hibernate_customer_crud_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.hcl.hibernate_customer_crud.Customer;

public class CustomerDao {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratheeka");
		EntityManager em;
		EntityTransaction et;
		
		public Customer saveCustomer(Customer c) {
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			if(c != null) {
				et.begin();
				em.persist(c);
				et.commit();
				System.out.println("........Data Stored.........");
			}
			else {
				System.out.println("..........Please set the data.........");
			}
			return c;
		}
		public Customer updateById(int id,String name,String email) {
			em = emf.createEntityManager();
			et = em.getTransaction();
			Customer c2 = em.find(Customer.class, id);
			c2.setName(name);
			c2.setEmail(email);
			if(c2 != null) {
				et.begin();
				em.merge(c2);
				et.commit();
				System.out.println("........Data Updated.........");
			}
			else {
				System.out.println("..........Please set the data.........");
			}
			return c2;
		}
		public Customer deleteById(int id) {
			em = emf.createEntityManager();
			et = em.getTransaction();
			Customer c2 = em.find(Customer.class, id);
			if(c2 != null) {
				et.begin();
				em.remove(c2);
				et.commit();
				System.out.println("........Data Deleted.........");
			}
			else {
				System.out.println("..........Please set the data.........");
			}
			return c2;
		}
		public Customer getAllData() {
			em = emf.createEntityManager();
			et = em.getTransaction();
			String query = "Select c from Customer c";
			Query query2 = em.createQuery(query);
			List<Customer> list  = query2.getResultList();
			list.forEach(a->System.out.println(a.getId()+" "+a.getName()+ " "+a.getEmail()+" "));
			
			return null;
		}
		public Customer getCustomerById(int id) {
			em = emf.createEntityManager();
			et = em.getTransaction();
			Customer c = em.find(Customer.class, id);
			System.out.println(c);
			
			return c;
		}
	}

	


