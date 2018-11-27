package com.test.restApplication;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControllerTest {
	
	@RequestMapping(value = "/student/{rollNo}", method = RequestMethod.GET)
	public Student retrieveDetailsForCourse() {
		
		Student s= new Student(111, "Rashmi");
		
		Student s1= new Student();
		s1.setName("Name");
		s1.setRollNo(2222);
		return s1;
	}
}
