package com.class27.Demo;

public class PhoneTester {



    public static void main(String[] args) {

        Phone iPhone = new iPhone();
        iPhone.unlockPhone();

        Phone samsung = new Samsung();
        samsung.displayPictures();
        samsung.makeCalls();

       // Phone phone = new Phone();
        // we cannot make an object of an abstract class

    }



}
