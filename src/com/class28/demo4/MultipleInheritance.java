package com.class28.demo4;

public class MultipleInheritance extends Parent1 {

}

class Parent1{
    void method(){
        System.out.println("method from parent 1");
    }
}
class Parent2{
    void method(){
        System.out.println("Method from parent 2");
    }

}

class Tester{
    public static void main(String[] args) {
         MultipleInheritance multi = new MultipleInheritance();
         multi.method();
    }
}

