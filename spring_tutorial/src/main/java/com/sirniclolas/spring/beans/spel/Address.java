package com.sirniclolas.spring.beans.spel;

public class Address {
    private String city;
    private  String street;

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "com.sirniclolas.spring.beans.Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
