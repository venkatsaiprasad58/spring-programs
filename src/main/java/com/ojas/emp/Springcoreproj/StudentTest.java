package com.ojas.emp.Springcoreproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.emp.Springcoreproj.configuration.StudentConfig;
import com.ojas.emp.Springcoreproj.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s = (Student) ctx.getBean("mystudent");
		System.out.println(s.dispName());
	}

}