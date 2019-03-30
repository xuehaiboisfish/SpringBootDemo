package com.example.manager.beans;

public class User {

    private String userName;
    private String userId;
    private String password;
    private String email;

    public User(String userId, String userName, String passwork, String email) {

        this.userId = userId;
        this.userName = userName;
        this.password = passwork;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
