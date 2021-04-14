package com.class28.demo4;

public class InterfaceTester {
    public static void main(String[] args) {

        InterfaceI1 interface1 = new Child();
        interface1.method();

        InterfaceI2 interface2 = new Child();
        interface2.method();
    }
}
