package com.class26;

public class Task1 {
    final int number;
    int var1=20;
    Task1(int number){
        this.number=number;

    }

//    void init(int number){
//        this.number=number;
//    }

    public static void main(String[] args) {
        final Task1 var1=new Task1(10);
        var1.var1=455555;

        final int[] a={10,20};
        a[1]=30;

    }
}
