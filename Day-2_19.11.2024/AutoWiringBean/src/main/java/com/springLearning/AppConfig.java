package com.springLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springLearning")
public class AppConfig {
	
	@Bean
	public Address address() {
		Address addr1 = new Address();
		addr1.setStreet("Sitapura");
		addr1.setCity("Jaipur");
		return addr1;
	}
	
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setName("Bhawuk");
		return emp;
	}
}