package com.springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProg {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        // Employee Beans
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1);

        Employee emp2 = (Employee) context.getBean("emp2");
        System.out.println(emp2);

        Employee emp3 = (Employee) context.getBean("emp3");
        System.out.println(emp3);

        // Student Beans
        Student st1 = (Student) context.getBean("st1");
        System.out.println(st1);

        Student st2 = (Student) context.getBean("st2");
        System.out.println(st2);

        Student st3 = (Student) context.getBean("st3");
        System.out.println(st3);
    }
}
