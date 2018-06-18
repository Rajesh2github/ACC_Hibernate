/*package com.boot.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.boot.demo.exception.UserException;

@ControllerAdvice
public class ExceptionHeandlarController {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<UserException> handelException(Exception ex){
		UserException userException = new UserException();
		userException.setExceptionId("404");
		userException.setErrorMessage(ex.getCause().getMessage());
		return new ResponseEntity<UserException>(userException, HttpStatus.OK);
	}

}
*/