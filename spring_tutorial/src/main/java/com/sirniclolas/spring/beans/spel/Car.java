package com.sirniclolas.spring.beans.spel;

public class Car {
    private  String brand;
    private  double price;
    private  double tyrePerimeter;

    public void setTyrePerimeter(double tyrePerimeter) {
        this.tyrePerimeter = tyrePerimeter;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "com.sirniclolas.spring.beans.Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrePerimeter=" + tyrePerimeter +
                '}';
    }
    public Car(){
        System.out.println("com.sirniclolas.spring.beans.Car's Constructor .................");
    }
}
