package com.ojas.springDemo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.springDemo11.config.StudentConfig;
import com.ojas.springDemo11.model.Sample;
import com.ojas.springDemo11.model.Student;


public class StudentApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student s = (Student)ac.getBean("mystudent");
        System.out.println(s.display());
    }
}
