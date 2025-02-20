package com.ys.ecommerce.exception;

public class UserNameOrEmailAlreadyExistException extends RuntimeException {
    public UserNameOrEmailAlreadyExistException(String msg) {
        super("Email or UserName Already exist : " +msg);
    }
}
