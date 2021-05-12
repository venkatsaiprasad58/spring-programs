package com.ojas.emp.Springcoreproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.emp.Springcoreproj.model.Employee;

public class EmpColTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Employee emp = (Employee) ctx.getBean("empObj");
		System.out.println(emp); 
	}

}
