package com.dhguo.vimeowbackend.payload.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
    private HttpStatus status;
    private String message;
    private Map<String, String> errors;

    public ErrorResponse() {
    }

    public ErrorResponse(HttpStatus status, String message, Map<String, String> errors) {
        this.status = status;
        this.message = message;
        this.errors = new HashMap<>();
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public void addError(String field, String errorMessage) {
        this.errors.put(field, errorMessage);
    }
}
