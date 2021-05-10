package com.ojas.springDemo11.model;

public class Sample {
	
	private String name;
	
	public Sample() {
		System.out.println("Default constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(name);
	}
	
	public void init() {
		System.out.println("this bean going through init");
	}
	public void destory() {
		System.out.println("bean will destory now");
	}

}
