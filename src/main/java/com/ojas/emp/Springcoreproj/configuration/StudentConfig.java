package com.ojas.emp.Springcoreproj.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojas.emp.Springcoreproj.model.Student;

@Configuration
public class StudentConfig {
	
	@Bean("mystudent")
	public Student createStudent() {
		Student s = new Student();
		s.setSname("Ramu");
		return s;
	}
}
