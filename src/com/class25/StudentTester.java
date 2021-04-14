package com.class25;

public class StudentTester {

    public static void main(String[] args) {

        Student student = new SyntaxStudent();
        student.eat();
        student.study();

        SyntaxStudent syntax = (SyntaxStudent) student;

        syntax.works();

        CollegeStudent college=new CollegeStudent();
        college.dorm();
        college.eat();
        college.study();


    }
}
