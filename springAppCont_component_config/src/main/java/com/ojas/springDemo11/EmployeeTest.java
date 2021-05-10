package com.ojas.springDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.springDemo11.model.Emp;
import com.ojas.springDemo11.model.Employee;
import com.ojas.springDemo11.model.Sample;


public class EmployeeTest 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("employeeContext.xml");
        Employee e = (Employee)ac.getBean("empObj");
        System.out.println(e);
    }
}
