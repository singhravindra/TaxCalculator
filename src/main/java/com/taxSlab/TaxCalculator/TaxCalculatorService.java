package com.taxSlab.TaxCalculator;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorService {

	private double taxableAmount=0; 
	public double calculateTaxSlab(int enterIncome) throws Exception{
		if(enterIncome<=0){
			throw new IncomeNotFoundException("Invalid Amount : " + enterIncome);
		}else if(enterIncome>0 && enterIncome<=10000){
			taxableAmount = enterIncome;
		}else if(enterIncome>10000 && enterIncome<=20000){
			taxableAmount = enterIncome * 0.1;
		}else if(enterIncome>20000){
			taxableAmount = enterIncome * 0.2;
		}
		return taxableAmount;
	
		
	}
}
