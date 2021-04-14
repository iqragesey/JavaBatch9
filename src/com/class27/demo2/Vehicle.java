package com.class27.demo2;

public abstract class Vehicle {

    String vin_number;
    static int totalVehicle;

    Vehicle(String vin_number){
        totalVehicle++;
        this.vin_number=vin_number;
    }

    public void totalVehiclesCreated(){
        System.out.println("We will build "+totalVehicle+" vehicles");
    }

    public void drive(){
        System.out.println("Driving...");
    }
    public void stop(){
        System.out.println("Stopping...");
    }

    public abstract void start();

}

abstract class Car extends Vehicle{

    String carType;

    Car(String vin_number, String carType){
        super(vin_number);
        this.carType=carType;
    }

    @Override
    public void drive() {
        System.out.println("Car can drive");
    }

    public abstract void speed();

}

class BMW extends Car{

    String make;
    String model;

    BMW(String vin_number, String carType, String make, String model) {
        super(vin_number, carType);
        this.make=make;
        this.model=model;
    }


    @Override
    public void start() {
        System.out.println("BMW can start with remote");

    }

    @Override
    public void speed() {
        System.out.println("BMW can go max 300km/");

    }
    public void display(){
        System.out.println("We build "+make+" model "+model+" "+carType+" "+vin_number);
    }
}

class Toyota extends Car{
    String make;
    String model;

    Toyota(String vin_number, String carType, String make, String model){
        super(vin_number, carType);
        this.make=make;
        this.model=model;

    }

    @Override
    public void start() {
        System.out.println("Toyota can also start with remote");
    }

    @Override
    public void speed() {
        System.out.println("Toyota can go up to 200Km/h");
    }

    void display(){
        System.out.println("We build "+make+" Model "+model+" "+carType+" "+vin_number);
    }
}