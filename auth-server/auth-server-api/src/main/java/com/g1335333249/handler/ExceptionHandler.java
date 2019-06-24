package com.g1335333249.handler;

import com.g1335333249.exception.UserLoginException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guanpeng
 * @date 2019-06-24 18:36
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(UserLoginException.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.OK);
    }
}
