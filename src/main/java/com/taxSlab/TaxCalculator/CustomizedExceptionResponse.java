package com.taxSlab.TaxCalculator;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
public class CustomizedExceptionResponse extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(IncomeNotFoundException.class)
	public final ResponseEntity<Object> handleIncorrectIncomeException(Exception ex, WebRequest request ){
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), "Entered amount is either Zero or in Negative", request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
