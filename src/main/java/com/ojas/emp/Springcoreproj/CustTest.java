package com.ojas.emp.Springcoreproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.emp.Springcoreproj.model.Customer;

public class CustTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("customeraddress.xml");
		Customer s = (Customer)ac.getBean("custObj");
		System.out.println(s);
		}

		}