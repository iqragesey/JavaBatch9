package com.class28.Encapsulation;

import com.class23.overriding.Bank;

public class BankTester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Iqra","iqrag","12345",10000.67);

        account.login("iqrag","12345");

        System.out.println(account.getBalance("iqra","12345"));



    }
}

