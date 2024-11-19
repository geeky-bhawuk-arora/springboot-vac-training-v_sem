package com.springLearning;

public class Student {
	private String cid;
	private String name;
	
	
	public Student() {
		
	}
	
	public Student(String cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return cid;
	}
	
	
	public void setId(String cid) {
		this.cid = cid;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + cid + ", name=" + name + "]";
	}
}