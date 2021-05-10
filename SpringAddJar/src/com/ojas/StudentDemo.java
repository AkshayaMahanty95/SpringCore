package com.ojas;

public class StudentDemo {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println( "Student name is " + name);
	}
}
