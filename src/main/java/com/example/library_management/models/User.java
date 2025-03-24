package com.example.library_management.models;

public class User {
    private String userId;
    private String password; //hashed
    private String username;
    private String fullName;
    private boolean status;

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }
}


