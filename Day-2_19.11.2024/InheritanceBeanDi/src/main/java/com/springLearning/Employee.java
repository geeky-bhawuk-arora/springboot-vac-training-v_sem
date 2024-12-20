package com.springLearning;

public class Employee {
	
	private String name;
	private String dept;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee name=" + name + ", dept=" + dept;
	}

	public Employee() {
		
	}

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
}