package com.example.spring_redit_clone.exceptions;

public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String message) {
        super(message);
    }
}
