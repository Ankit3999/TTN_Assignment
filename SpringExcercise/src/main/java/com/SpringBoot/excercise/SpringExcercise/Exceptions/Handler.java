package com.SpringBoot.excercise.SpringExcercise.Exceptions;

import com.SpringBoot.excercise.SpringExcercise.Exceptions.ExceptionResponse;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class Handler extends ResponseEntityExceptionHandler {
    //for all the exception other than NotFoundException
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception e, WebRequest request)
    {
        ExceptionResponse exceptionResponse =   new ExceptionResponse(e.getMessage());
        return new ResponseEntity(exceptionResponse, HttpStatus.EXPECTATION_FAILED);
    }

    //not found exception- function which throw new NotFoundException will be caught here
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> NotFoundException(ChangeSetPersister.NotFoundException ex, WebRequest request)
    {
        ExceptionResponse exceptionResponse= new ExceptionResponse(ex.getMessage());

        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
