package com.class24.demo5;

public class WebDriver {

    void openWebsite(){
        System.out.println("Opening the website");
    }
    void closeWebsite(){
        System.out.println("Opening the website");
    }
    void loginWebsite(){
        System.out.println("Opening the website");
    }
    void signupWebsite(){
        System.out.println("Opening the website");
    }
    void downloadFile(){
        System.out.println("Opening the website");
    }
}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website google chrome");
    }
    void closeWebsite(){
        System.out.println("Opening the website google chrome");
    }
    void loginWebsite(){
        System.out.println("Opening the website google chrome");
    }
    void signupWebsite(){
        System.out.println("Opening the website google chrome");
    }
    void downloadFile(){
        System.out.println("Opening the website google chrome");
    }

}
class Firefox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website Firefox");
    }
    void closeWebsite(){
        System.out.println("Opening the website firefox");
    }
    void loginWebsite(){
        System.out.println("Opening the website firefox");
    }
    void signupWebsite(){
        System.out.println("Opening the website firefox");
    }
    void downloadFile(){
        System.out.println("Opening the website firefox");
    }
}