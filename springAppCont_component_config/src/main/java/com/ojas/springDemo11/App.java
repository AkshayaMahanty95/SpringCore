package com.ojas.springDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.springDemo11.model.Sample;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sample s = (Sample)ac.getBean("sample");
        s.display();
        System.out.println("-----------------------------------");
        
        Sample s1 = (Sample)ac.getBean("sample");
        s1.display();
    }
}
