package com.class28.GroupWork;

public abstract class Car {
    String color;
    double carPrice;
    Car(String color, double carPrice) {
        this.carPrice = carPrice;
        this.color = color;
    }
       abstract void calculateSalePrice();
    }
class Sedan extends Car{
    double length;
    Sedan(String color, double carPrice, double length) {
        super(color, carPrice);
        this.length=length;
        System.out.println("You have a "+color+" sedan that costs "+carPrice+" dollars and is "+length+" feet long.");
    }
    @Override
    void calculateSalePrice() {
        double discount;
        if(length>20){
            discount=0.05*carPrice;
            System.out.println("You will receive a 5% discount making your total for the Sedan "+discount);
        }else {
            discount =.1*carPrice;
            System.out.println("You will receive a 10% discount making your total for the Sedan "+discount);
        }
    }
}

class Truck extends Car{

    double weight;
    Truck(String color, double carPrice, double weight) {
        super(color, carPrice);
        this.weight=weight;
        System.out.println("You have a "+color+" truck that costs "+carPrice+" dollars and weights "+weight+" lbs.");

    }

    double discount;
    void calculateSalePrice() {
        if(weight>2000){
            discount=.1*carPrice;
            System.out.println("You will receive a 10% discount making your total for the Truck "+discount);
        }else{
            discount=.2*carPrice;
            System.out.println("You will receive a 20% discount making your total for the Truck "+discount);
        }

    }
}