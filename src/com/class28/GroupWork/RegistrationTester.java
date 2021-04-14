package com.class28.GroupWork;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("email@yahoo.com");
        System.out.println("Your email is "+registration.getEmail());
        registration.setUserName("John.Doe");
        System.out.println("Username is "+registration.getUserName());
        registration.setPassword("Cars123", "John.doe");
        System.out.println("Your password is "+registration.getPassword());
    }
}

