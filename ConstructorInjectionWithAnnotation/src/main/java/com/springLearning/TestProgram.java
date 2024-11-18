package com.springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProgram {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext (AppConfig.class);
		EmployeeService employee = context.getBean(EmployeeService.class);
		employee.showData();
	}
}