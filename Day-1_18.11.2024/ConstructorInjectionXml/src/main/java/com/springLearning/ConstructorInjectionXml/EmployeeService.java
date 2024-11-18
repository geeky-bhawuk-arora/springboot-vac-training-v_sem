package com.springLearning.ConstructorInjectionXml;

public class EmployeeService {
	private Employee employee;
	
	public EmployeeService(Employee employee) {
		this.employee=employee;
	}
	public void showData() {
		System.out.print(employee.getName() + " "+ employee.getAge()+" "+ employee.getEmail());
	}
}
