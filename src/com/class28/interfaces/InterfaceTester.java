package com.class28.interfaces;

public class InterfaceTester {
    public static void main(String[] args) {

       // IParent iParent = new IParent();

        IParent iParent = new AdvanceChild();
        iParent.method1();
//cannot do iParent.method2(); because method 2 is in in Iparent




    }
}
