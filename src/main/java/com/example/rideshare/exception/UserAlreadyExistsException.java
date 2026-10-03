package com.example.rideshare.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException n(String message) { super(message);}
}