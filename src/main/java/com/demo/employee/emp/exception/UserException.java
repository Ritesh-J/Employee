package com.demo.employee.emp.exception;

public class UserException extends Exception{
    private static final Long serialVersionUid=1L;
    private String errorMessage;
    public UserException() {

    }

    public UserException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
