package com.taylor.oauth.service.exception;

public class ApiException extends RuntimeException {

    public ApiException(String message) {
        super(message);
    }
}
