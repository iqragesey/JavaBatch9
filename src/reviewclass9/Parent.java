package reviewclass9;

public class Parent {

    double PI=3.14;

    double calculateArea(double height, double width){
        return height*width;

    }
}
class Child extends Parent{

    double area(double height, double width, double length){
        return height*super.calculateArea(length, width);

    }
}