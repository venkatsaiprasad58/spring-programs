package com.ojas.emp.Springcoreproj.model;

public class Sample {
	String name;
	
	

	public Sample() {
		super();
		System.out.println("Default construtor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Welcome to " + name);
	}
	
	public void init() {
		System.out.println("this bean is going	through init");
	}
	public void destory() {
		System.out.println("Destory method");
	}

}