package com.sirniclolas.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person3");
        System.out.println("person:\t"+person);

        NewPerson newPerson=(NewPerson) context.getBean("newPerson");
        System.out.println("newPerson:\t"+newPerson);

        DataSource dataSource =(DataSource)context.getBean("datasource");
        System.out.println("dataSource:\t"+dataSource);

        Person person4 = (Person) context.getBean("person4");
        System.out.println("person4:\t"+person4);

        Person person5 = (Person) context.getBean("person5");
        System.out.println("person5:\t"+person5);


    }
}
