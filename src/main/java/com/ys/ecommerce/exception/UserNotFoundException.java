package com.ys.ecommerce.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String value) {
        super("User not found with the attribute provided : " + value);
    }
}
