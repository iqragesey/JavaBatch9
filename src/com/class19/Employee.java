package com.class19;

public class Employee {

    String name;
    String empID;
    double salary;
    String department;

    public Employee(String name, String empID, double salary, String department){
        this.name = name;
        this.empID=empID;
        this.salary=salary;
        this.department=department;


    }

    void printInfo(){
        System.out.println("Name" +name+" Employee "+empID);
    }

}

