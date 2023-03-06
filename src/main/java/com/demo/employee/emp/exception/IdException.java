package com.demo.employee.emp.exception;

public class IdException extends Exception{
    private static final Long serialVersionUid=1L;
    private String errorMessage;
    public IdException() {

    }

    public IdException(String message, String errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
