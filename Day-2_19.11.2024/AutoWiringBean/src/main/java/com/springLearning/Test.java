package com.springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext (AppConfig.class);
		Employee emp1 = context.getBean(Employee.class);
		System.out.println(emp1);
		
		Address addr2 = context.getBean(Address.class);
		System.out.println(addr2);
		
		Country c2 = context.getBean(Country.class);
		System.out.println(c2);
		
		
	}
}
