package org.alvas.one_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;


public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratheeka");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	public Person savePerson(Person p,Adhar a) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		if(p != null) {
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(a);
			entityTransaction.commit();
			System.out.println("........Data Stored.........");
		}
		else {
			System.out.println("..........Please set the data.........");
		}
		return p;
		
	}
	public Person getPersonAdhar(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Person p = entityManager.find(Person.class, id);
		Adhar a = entityManager.find(Adhar.class, id);
		System.out.println(p);
		System.out.println(a);
		return p;
	}
	public Person deleteById(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Person p = entityManager.find(Person.class, id);
		entityTransaction.begin();
		Adhar adhar = entityManager.find(Adhar.class, p.getAdhar());
		entityManager.remove(adhar);
		entityManager.remove(p);
		entityTransaction.commit();
		
		return p;
		
	}
	public Person updateById(int id,String name,long adharno)
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		Adhar adhar = entityManager.find(Adhar.class, person.getAdhar().getId());
	 
		person.setName(name);
		adhar.setAdharNum(adharno);
		person.setAdhar(adhar);
		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(adhar);
		entityTransaction.commit();
		System.out.println("...........Data updated =...........");
		return person;
	 
	}

}
