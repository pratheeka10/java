package org.alvas.controller;

import javax.security.auth.login.AppConfigurationEntry;

import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class StudentController {

	@Autowired
	static Student student;
	
	@Autowired
	static StudentService service;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		
		Student student = (Student) applicationContext.getBean("myStudent");
		student.setId(101);
		student.setName("Pratheeka");
		student.setEmail("pratheeka@gmail.com");
		
		service.saveStudent(student);
		
		System.out.println("Main Started...");

	}

}
