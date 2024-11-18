package com.springLearning.ConstructorInjectionXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeService employee = (EmployeeService) context.getBean("employeeService");
		employee.showData();
	}
}