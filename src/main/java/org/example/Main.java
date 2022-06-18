package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar2.make = "Opel";
        myCar2.model = "Vectra";
        myCar2.year = 1992;
        myCar2.color = "red";

        System.out.println(myCar1.make);
        System.out.println(myCar1.color+"\n");

        System.out.println(myCar2.make);
        System.out.println(myCar2.color+"\n");

        myCar1.drive();
        myCar2.drive();
    }
}