package br.senai.example.doctor_registration.dto;

import org.springframework.validation.FieldError;

public class ErrorResponse {

    private String field;
    private String message;

    public ErrorResponse(){}

    public ErrorResponse(FieldError fieldError) {
        this.field = fieldError.getField();
        this.message = fieldError.getDefaultMessage();
    }

    public ErrorResponse(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
