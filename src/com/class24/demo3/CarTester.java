package com.class24.demo3;

public class CarTester {
    public static void main(String[] args) {


        Car car1 = new BMW();// this is widening
        car1.start(); //method from child will be called bc we have overriden
        car1.stop();//method from parent will be called bc we have not overriden
     // bmw.drifting(); CE bc we are trying to call something not in parent class

       // BMW bmw1=(BMW) bmw; // we converted our reference back to BMW we can call all the methods from BMW class
        //bmw1.drifting();

        Car car = new Tesla();
       // BMW bmw2=(BMW) car; - forcing java to make BMW a car when it's tesla
        //when trying to assign a parent type to a child type, it will not work
        //this will give runtime error, not compiler error

        BMW bmw = new BMW();


    }

}
