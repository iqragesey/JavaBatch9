package com.class28.GroupWork;

public class CarTester {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("black", 250000, 30);
        sedan.calculateSalePrice();


        Truck truck = new Truck("green", 45000, 2500);
        truck.calculateSalePrice();



    }
}
