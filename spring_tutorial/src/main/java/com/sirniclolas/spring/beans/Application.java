package com.sirniclolas.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        //创建一个HelloWorld对象
//        com.sirniclolas.spring.beans.HelloWorld helloWorld = new com.sirniclolas.spring.beans.HelloWorld();
        //为name属性赋值
//        helloWorld.setName("sirniclolas");
        //调用hello方法

        //1.创建spring的 IOC容器对象
        //ApplicationContext 代表IOC容器
        //ClassPathXmlApplicationContext ： 是ApplicationContext 接口的实现类，该实现
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器中获取Bean 实例
//        com.sirniclolas.spring.beans.HelloWorld helloWorld= (com.sirniclolas.spring.beans.HelloWorld) context.getBean("helloWorld");
//        com.sirniclolas.spring.beans.HelloWorld helloWorld2 = (com.sirniclolas.spring.beans.HelloWorld) context.getBean("helloWorld2");
        //利用类型返回IOC容器的Bean ,但是要求IOC容器只能有唯一一个该类型的Bean
//        com.sirniclolas.spring.beans.HelloWorld helloWorld = context.getBean(com.sirniclolas.spring.beans.HelloWorld.class);
//        System.out.println(helloWorld2);
//        com.sirniclolas.spring.beans.Car car = context.getBean(com.sirniclolas.spring.beans.Car.class);
//        System.out.println(car);
            Car car = (Car) context.getBean("car");
//        System.out.println(car);
        Car car2 = (Car) context.getBean("car2");
//        System.out.println(car2);
            Person person= (Person) context.getBean("person");
        System.out.println(person);
        com.sirniclolas.spring.beans.Person person2= (com.sirniclolas.spring.beans.Person) context.getBean("person2");
        System.out.println(person2);
        //3.调用hello方法
//        helloWorld2.hello();
    }
}
