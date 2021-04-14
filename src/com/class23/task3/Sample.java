package com.class23.task3;

public class Sample {

    static void printInfo(String name){
        System.out.println(name);

    }
    static void printInfo(String name, String address){
        System.out.println(name+address);
    }

    static void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+address+phoneNumber);
    }

    public static void main(String[] args) {

        printInfo("Iqra");
        printInfo("Iqra", "address 1234");
        printInfo("Iqra", "address 1234", "12453685");



    }


}
