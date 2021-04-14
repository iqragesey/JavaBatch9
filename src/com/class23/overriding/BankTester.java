package com.class23.overriding;

public class BankTester {
    public static void main(String[] args) {


        BankOfAmerica bankOfAmerica = new BankOfAmerica();
        bankOfAmerica.chargeTransferFee(1000);

        Chase chase = new Chase();
        chase.chargeTransferFee(1000);

        CitizenBank citizen = new CitizenBank();
        citizen.chargeTransferFee(1000);

        Bank mainBank= new Bank();
        mainBank.chargeTransferFee(1000);
    }
}
