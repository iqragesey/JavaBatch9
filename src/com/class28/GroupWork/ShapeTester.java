package com.class28.GroupWork;

public class ShapeTester {
        public static void main(String[] args) {
            Circle c = new Circle(4);
            System.out.println("Area of circle: " + c.calculateArea());
            System.out.println("Perimeter of circle "+c.calculatePerimiter());
            Square area = new Square(5.0, 5.0);
            System.out.println("Area of square is " + area.calculateArea());
            Square perimeter=new Square(4,5.0);
            System.out.println("Perimeter of square is "+perimeter.calculatePerimiter());
        }
    }

