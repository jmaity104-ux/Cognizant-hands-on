package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = context.getBean("student1", Student.class);

        Student student2 = context.getBean("student2", Student.class);

        System.out.println("Student 1");

        student1.showDetails();

        System.out.println();

        System.out.println("Student 2");

        student2.showDetails();
    }
}