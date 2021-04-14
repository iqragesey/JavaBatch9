package com.class23.task2;

public class Programming {

    Programming(){
        System.out.println("I love programming lanuages");

    }

    Programming(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {

        Programming obj1= new Programming();
        Programming obj2 = new Programming("+ccc");

    }


}
