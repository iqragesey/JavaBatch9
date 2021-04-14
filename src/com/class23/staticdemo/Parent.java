package com.class23.staticdemo;

public class Parent {

    static void printInfo(String name){
        System.out.println("Name from parent "+name);

    }

}

class Child extends Parent{

    static void printInfo(String name){
        System.out.println("Name from Child "+name);

    }

    public static void main(String[] args) {

        Child.printInfo("Iqra");
        Child.printInfo("CJ");
    }

}
