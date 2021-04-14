package com.class28.Task;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the google chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the google chrome browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the google chrome  browser");

    }

    @Override
    public void findElement() {
        System.out.println("Finding the elemnts from the google chrome browser");

    }
}
class Firefox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Firefox");

    }

    @Override
    public void findElement() {
        System.out.println("Find the elements for Firefox");

    }
}