package com.ojas.springDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.springDemo11.model.Emp;
import com.ojas.springDemo11.model.Sample;


public class EmpTest 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("empContext.xml");
        Emp e = (Emp)ac.getBean("emp");
        System.out.println(e);
    }
}
