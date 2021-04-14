package com.class24.demo2;

public class Employee {

    double salary;
    void work(){
        System.out.println("Employee is working");
    }
    void getPaid(){
        System.out.println("Employee is getting paid "+salary);
    }
    void goOnLeave(){
        System.out.println("Employee is going on leave");
    }
}
class FullTimeEmp extends Employee{

}
class PartTimeEmp extends Employee{

    @Override
    void goOnLeave() {
        System.out.println("Part time employees don't get leaves");
    }
}

class Contractor extends Employee{

    @Override
    void goOnLeave() {
        System.out.println("Contractor employees don't get leaves");
    }

    @Override
    void getPaid() {
        System.out.println("Paid on an hourly basis");
    }
}