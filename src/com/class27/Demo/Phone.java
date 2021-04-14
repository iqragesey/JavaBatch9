package com.class27.Demo;

abstract class Phone{  ///company who provides the network
    void makeCalls(){

        System.out.println("Calling....");
    }
    void sendText(){

        System.out.println("Texting...");
    }
    abstract void displayPictures();
    abstract void unlockPhone();


}
class iPhone extends Phone{

    void displayPictures(){
        System.out.println("Iphone uses photos app to diplay");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can open phone w faceID");
    }
}

class Samsung extends Phone{

    @Override
    void unlockPhone() {
        System.out.println("Can unlock with faceID and fingerprint");
    }

    @Override
    void displayPictures() {
        System.out.println("Uses gallery app to open pictures");


    }

    @Override
    void makeCalls() {
        System.out.println("Calling from Samsung...");
    }
}

