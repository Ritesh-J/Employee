package com.demo.employee.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorResponse> exceptionUserHandler(Exception e) {
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(IdException.class)
    public ResponseEntity<ErrorResponse> errorHandlerIdNotPresent(Exception e) {
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }

}
