package com.ojas.springDemo11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojas.springDemo11.model.Student;

@Configuration
public class StudentConfig {

	@Bean(value = "mystudent")
	public Student createStudent() {
		Student s = new Student();
		s.setName("Akshaya");
		return s;
	}
	
}
