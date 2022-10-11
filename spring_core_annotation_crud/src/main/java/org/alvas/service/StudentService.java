package org.alvas.service;

import org.alvas.dto.Student;
import org.alvas.dto.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myService")
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public Student saveStudent(Student student) {
		
		return studentDao.saveStudent(student);
	}

}
