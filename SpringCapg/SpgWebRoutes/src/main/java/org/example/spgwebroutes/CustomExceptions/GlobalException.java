package org.example.spgwebroutes.CustomExceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(NotFoundException.class)
    public String notFound(NotFoundException e){
        return e.getMessage();
    }
}
