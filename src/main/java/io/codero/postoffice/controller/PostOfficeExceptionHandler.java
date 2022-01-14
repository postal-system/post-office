package io.codero.postoffice.controller;

import io.codero.postoffice.exception.PostOfficeNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class PostOfficeExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(PostOfficeNotFoundException.class)
    public ResponseEntity<?> handlePersonNotFoundException(PostOfficeNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }
}
