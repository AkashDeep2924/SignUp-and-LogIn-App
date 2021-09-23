package com.akashdeep.signupandloginpage.Models;

public class Users {
    String userName, mail, password, userId;

    public Users(String userName, String mail, String password, String userId) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
    }

    public Users(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }

    public Users(){}



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
