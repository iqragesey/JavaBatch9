package com.class28.interfaces;

public interface IParent {

  //private int number=10; all variables in interfaces are public

    //
    public static final int number=10; // no need to make the variables public static or final because they already are


    int number2=20;

//interface cannot have constructors because they don't have instance fields

    void method1();
}


interface IParent2{

    void method2();

}

class AdvanceChild implements IParent, IParent2{

    @Override
    public void method1() {
        System.out.println("From iParent");
    }

    @Override
    public void method2() {
        System.out.println("Iparent2");

    }
}