package io.codero.postoffice.exception;

public class PostOfficeNotFoundException extends RuntimeException {
    public PostOfficeNotFoundException(String message) {
        super(message);
    }
}