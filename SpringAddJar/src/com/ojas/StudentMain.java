package com.ojas;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		StudentDemo stud=(StudentDemo)factory.getBean("hello");
		stud.display();
	}

}
