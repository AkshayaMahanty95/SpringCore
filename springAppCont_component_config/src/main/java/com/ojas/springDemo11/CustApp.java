package com.ojas.springDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.springDemo11.model.Customer;
import com.ojas.springDemo11.model.Sample;


public class CustApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("customeraddress.xml");
        Customer s = (Customer)ac.getBean("custObj");
        System.out.println(s);
    }
}
