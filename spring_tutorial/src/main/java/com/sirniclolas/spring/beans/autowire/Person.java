package com.sirniclolas.spring.beans.autowire;


import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private Car car;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.sirniclolas.spring.beans.autowire.Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
