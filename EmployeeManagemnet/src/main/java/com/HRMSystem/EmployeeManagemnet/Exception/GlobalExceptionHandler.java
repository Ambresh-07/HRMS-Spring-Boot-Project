package com.HRMSystem.EmployeeManagemnet.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.HRMSystem.EmployeeManagemnet.Payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {

//		ex.getMessage();
//		ApiResponse
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();

	}

}
