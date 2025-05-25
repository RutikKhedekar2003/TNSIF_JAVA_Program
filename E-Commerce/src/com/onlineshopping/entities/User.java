package com.onlineshopping.entities;

public abstract class User {
    protected String userId;
    protected String username;
    protected String email;

    public User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
}