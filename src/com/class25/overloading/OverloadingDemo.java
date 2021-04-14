package com.class25.overloading;

public class OverloadingDemo {

    void printInfo(String name){
        System.out.println("Name "+name);
    }

    void printInfo(String name, String address){
        System.out.println("Name "+name+" address "+address);
    }

    void printInfo(String name, int number, String address){
        System.out.println("Name "+name+" Number "+number+" address "+address);
    }

    void doCalculation(){
        System.out.println(10/0);
    }
}

