package org.alvas.one_to_one_uni.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;
import org.alvas.one_to_one_uni.dao.PersonDao;

public class PersonController {
	static Person person = new Person();
	static Adhar adhar = new Adhar();
	static PersonDao dao = new PersonDao();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. SavePersonAdhar");
			System.out.println("2. GetPersonAdhar");
			System.out.println("3. DeletePersonAdhar");
			System.out.println("Choose your choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:{
				adhar.setAdharNum(237654789);
				adhar.setAddress("Udupi");
				
				person.setName("Pratheeksha");
				person.setEmail("pratheeksha@gmail.com");
				person.setAdhar(adhar);
				dao.savePerson(person, adhar);
			}break;
			case 2:{
				Person person = dao.getPersonAdhar(1);
				System.out.println("Person Details");
				System.out.println(person.getId()+"\t"+person.getEmail()+"\t");
				System.out.println("Adhar Details");
				System.out.println(person.getAdhar().getId());
				System.out.println(person.getAdhar().getAdharNum());
				System.out.println(person.getAdhar().getAddress());
			}break;
			case 3:{
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				Person person = dao.deleteById(id);
			}break;
			case 4: {
				Person person = new Person();
				System.out.println("enter the id");
				int id = scanner.nextInt();
				System.out.println("enter the customer name");
				String name =(scanner.next());

				System.out.println("enter the adharno");
				long adharno = scanner.nextLong();
				dao.updateById(id,name,adharno);

				}
				break;
			}
			
		}

	}

}
