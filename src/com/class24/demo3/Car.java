package com.class24.demo3;

public class Car {

    void start(){
        System.out.println("Use the key to start the car");
    }
    void stop(){
        System.out.println("Use the brake to stop the car");
    }
    void park(){ System.out.println("Park me manually");
    }
}


class BMW extends Car{
    void start(){
        System.out.println("Use the key to start me");
    }
    void drifting(){
        System.out.println("I can drift");
    }
}

class Tesla extends Car{
    void start(){
        System.out.println("Use app to start me");
    }

    void park(){
        System.out.println("Park me using sensor and camera");
    }
}

class Toyota extends Car{

}