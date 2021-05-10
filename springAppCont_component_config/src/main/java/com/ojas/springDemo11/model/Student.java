package com.ojas.springDemo11.model;

import org.springframework.stereotype.Component;
//Student student = new Student();
@Component
public class Student {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String display() {
		return "Hello " + name;
	}

}
