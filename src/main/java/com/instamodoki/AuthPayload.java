package com.instamodoki;

public class AuthPayload {
    private final String token;
    private final User user;

    public AuthPayload(String token, User user) {
        this.token = token;
        this.user = user;
    }
}
