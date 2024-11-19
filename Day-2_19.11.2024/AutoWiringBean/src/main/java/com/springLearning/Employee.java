package com.springLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String name;
	
	@Qualifier("address")
	@Autowired
	private Address addr;
	
	@Qualifier("country")
	@Autowired
	private Country country;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", addr=" + addr + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
