package com.ojas.emp.Springcoreproj.model;

public class Employee {
	int empNo;
	String ename;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
