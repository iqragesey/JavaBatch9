package com.class24.homework;

public class CreditCard {

    double balance;
    double interest;

    void checkInterest(double balance){
        interest=balance*0.24;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
}
class Amex extends CreditCard {
    void checkInterest(double balance) {
        interest = balance * 0.20;
        System.out.println(interest);
    }
}
class testCredit {
    public static void main(String[] args) {

        CreditCard cc = new CreditCard();
        cc.checkInterest(1500);

        Visa visa = new Visa();
        visa.checkInterest(1500);

        Amex amex=new Amex();
        amex.checkInterest(2000);

    }
}

