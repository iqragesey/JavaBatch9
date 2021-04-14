package com.class23;

public class Task1 {

    //create 1 class in which create a methods that will calculate the area (volume) of a
    //rectangle, square and box

    void area(double length){
        System.out.println("The area of a square is "+length*length);

    }

    void area(double length, double width){
        System.out.println("The area of a rectangle is "+length*width);
    }

    void area(double length, double width, double height){
        System.out.println("The area of a box is "+length*height*width);
    }

    public static void main(String[] args) {

        Task1 print= new Task1();

        print.area(15.0);
        print.area(15.0, 18.2);
        print.area(12.5,15.4, 15.4);

    }



    }






