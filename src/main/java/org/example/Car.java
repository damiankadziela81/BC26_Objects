package org.example;

public class Car {

    String make = "Porsche";
    String model = "911";
    int year = 1986;
    String color = "yellow";
    double price = 30000.00;

    void drive(){
        System.out.println("You drive the "+color+" car.");
    }
    void brake(){
        System.out.println("You step on the brakes.");
    }
}
