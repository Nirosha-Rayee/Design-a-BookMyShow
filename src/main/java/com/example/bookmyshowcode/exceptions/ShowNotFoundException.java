package com.example.bookmyshowcode.exceptions;

public class ShowNotFoundException extends RuntimeException{
    public ShowNotFoundException(String message) {
        super(message);
    }
}
