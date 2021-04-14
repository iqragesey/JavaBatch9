package com.class25.overriding;

public class Father {
    String name;
    Father(String name){
        this.name=name;

    }

    void eat(){
        System.out.println(name+" likes to eat rice");
    }
    void sleep(){
        System.out.println(name+" likes to sleep 6 hours");
    }

}
