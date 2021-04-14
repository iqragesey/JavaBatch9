package com.class25.overriding;

public class Ozoda extends Father{
    public Ozoda(String name) {
        super(name); //super calls from parent class
    }

    @Override
    void sleep() {
        System.out.println(name+" likes to sleep 16 hours");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" likes to eat burgers");
    }
}
