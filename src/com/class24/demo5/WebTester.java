package com.class24.demo5;

public class WebTester {
    public static void main(String[] args) {


        WebDriver webDriver = new Firefox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadFile();
        webDriver.closeWebsite();


    }
}