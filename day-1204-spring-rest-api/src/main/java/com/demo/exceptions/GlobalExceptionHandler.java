package com.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidExpcetion(MethodArgumentNotValidException ex) {
		
	   Map<String, String> errorMap = new HashMap<>();
	   
	  
	   ex.getBindingResult().getFieldErrors()
	   	.stream()
	   	.forEach(error -> {
	   		String fieldName = error.getField();
	   		String message = error.getDefaultMessage();
	   		errorMap.put(fieldName, message);
	   	});
	  
		
		return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		
		String message = ex.getMessage();
		
		return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
