package com.class27.demo2;

public class VehicleTester {
    public static void main(String[] args) {


        BMW bmw = new BMW("12345xML", "Sedan", "BMW", "X");

        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle = new Toyota("12345", "SUV", "Toyota", "RAV4");

       vehicle.drive();
       vehicle.start();

    }







}
