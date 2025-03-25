package com.example.library_management.models;

public class User {
    private String userId;
    private String password; //hashed
    private String username;
    private String fullName;
    private boolean status;

    public User(String userId, String password, String username, String fullName, boolean status) {
        this.userId = userId;
        this.password = password;
        this.username = username;
        this.fullName = fullName;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }
}


