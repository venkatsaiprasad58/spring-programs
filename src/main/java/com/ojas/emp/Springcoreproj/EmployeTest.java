package com.ojas.emp.Springcoreproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.emp.Springcoreproj.model.Employe;

public class EmployeTest {
	
	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("Employe.xml");
		Employe emp = (Employe) ctx.getBean("empObj");
		System.out.println(emp);
		
//		System.out.println(emp.getId());
//        System.out.println(emp.getName());
//       System.out.println(emp.getSkillset());
//       System.out.println( emp.getProjects());
//        System.out.println(emp.getPhone_nos());
        
    }
}
