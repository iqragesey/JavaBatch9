package com.class23.task4;

public class Sample {

    private void printInfo(String name){
        System.out.println(name);

    }
    private void printInfo(String name, String address){
        System.out.println(name+address);
    }

    private void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+address+phoneNumber);
    }
//because methods are private, we need to create an object to call an instance method to call in static
    public static void main(String[] args) {

        Sample sample=new Sample();
        sample.printInfo("Iqra");
        sample.printInfo("iqra", "address 2");
        sample.printInfo("iqra", "address", "547945");
    }


    }
