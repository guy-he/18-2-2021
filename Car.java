package com.company;



public class Car {
    String brand;
    String model;
    int year;
    double weight;
    int price;

    public Car(String brand, String model, int year, double weight, int price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.price = price;

    }

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }


}
