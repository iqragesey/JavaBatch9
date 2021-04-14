package com.class28.Task;

public class DriverTester {

    public static void main(String[] args) {
        WebDriver webDriver = new Firefox();

        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();

    }
}


