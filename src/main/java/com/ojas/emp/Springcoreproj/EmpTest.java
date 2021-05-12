package com.ojas.emp.Springcoreproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.emp.Springcoreproj.model.Employee;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("empContext.xml");
		Employee emp = (Employee) ctx.getBean("EmployeeOjas");
		System.out.println(emp);
		

	}

}