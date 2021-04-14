package com.class25;

public class Student {
    void eat(){
        System.out.println("student eats");
    }

    void study(){
        System.out.println("Student studies");
    }

    void doHomeWork(){
        System.out.println("Students must do homework");
    }
}
class SyntaxStudent extends Student{
    void doHomeWork() {
        System.out.println("Syntax student must do HW to suceed & get a job");
    }

    void works(){
        System.out.println("Syntax student works full time job");
    }


}

class CollegeStudent extends Student{
    void dorm(){
        System.out.println("College student lives in a dorm");
    }

}

class SchoolStudent extends Student{
    void home(){
        System.out.println("school student lives at home with parents");
    }

}