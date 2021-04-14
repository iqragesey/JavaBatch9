package com.class28.GroupWork;

public class Registration {
    private String email;
    private String userName;
    private String password;
    String getUserName() {
        return userName; }
    public void setUserName(String userName) {
        if (userName.length() < 6) {
            System.out.println("Username can not be empty or shorter than 6 characters ");
        } else {
            this.userName = userName; }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Email must be @yahoo.com");
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password, String userName) {
        if (password.length() < 6) {
            System.out.println("Username can not be empty or shorter than 6 characters");
        } else if (password.contains(userName)) {
            System.out.println("Your password must be different than your Username");
        } else {
            this.password = password;
        }
    }
}

