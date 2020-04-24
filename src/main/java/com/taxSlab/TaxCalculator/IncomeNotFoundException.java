package com.taxSlab.TaxCalculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class IncomeNotFoundException extends RuntimeException {

	public IncomeNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	
}
