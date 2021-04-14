package com.class25.overriding;

public class Khadija extends Father{

    public Khadija(String name){
        super(name);
    }

    @Override
    void eat() {
        super.eat(); //super calls from parent class
        System.out.println(name+" likes to eat beans too");
    }

    @Override
    void sleep() { //no super so this is their own characteristic
        System.out.println(name+" likes to sleep 12 hours");
    }

}
