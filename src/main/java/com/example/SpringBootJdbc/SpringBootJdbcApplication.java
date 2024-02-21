package com.example.SpringBootJdbc;

import com.example.SpringBootJdbc.model.Student;
import com.example.SpringBootJdbc.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringBootJdbcApplication.class, args);
		Student s= context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Nayan");
		s.setMarks(78);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);

	}
	}
