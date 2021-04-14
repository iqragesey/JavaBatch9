package com.class28.interfaces;

public class demo5 implements I1, I2{
    public void method1(){
        I1.method1();
        I2.method1();
    }

}
interface I1{
    static void method1(){
        System.out.println("Interface 1");
    }
}
interface I2{
    static void method1(){
        System.out.println("interface 2");
    }
}
