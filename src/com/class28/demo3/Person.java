package com.class28.demo3;

public interface Person {

    void sleep();
    void eat();
}

interface Employee{
    void work();
}
interface SyntaxEmployee extends Person, Employee{
    void work();
    void teach();

}

class Emp implements SyntaxEmployee{

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
    @Override
    public void work() {


    }

    @Override
    public void teach() {

    }
}