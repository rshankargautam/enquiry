package com.boot.enquiry.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {


	  @ExceptionHandler
	  public ResponseEntity<UserErrorResponse> handleException(InvalidUserException exc) { // create a StudentErrorResponse

	  UserErrorResponse error = new UserErrorResponse();
	  error.setStatus(HttpStatus.NOT_FOUND.value());
	  error.setMessage(exc.getMessage());
	  error.setTimeStamp(System.currentTimeMillis());

	  return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); }

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException exc) {

		UserErrorResponse error = new UserErrorResponse();
		error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(Exception exc) {

		UserErrorResponse error = new UserErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
