package com.taxSlab.TaxCalculator;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorService {

	private double taxableAmount=0; 
	public double calculateTaxSlab(int enterIncome) throws Exception{
		if(enterIncome<=IncomeSlabConstants.ZERO){
			throw new IncomeNotFoundException("Invalid Amount : " + enterIncome);
		}else if(enterIncome>IncomeSlabConstants.ZERO && enterIncome<=IncomeSlabConstants.TEN_THOUSAND){
			taxableAmount = enterIncome;
		}else if(enterIncome>IncomeSlabConstants.TEN_THOUSAND && enterIncome<=IncomeSlabConstants.TWENTY_THOUSAND){
			taxableAmount = enterIncome * IncomeSlabConstants.PERCENTAGE_10;
		}else if(enterIncome>IncomeSlabConstants.TWENTY_THOUSAND){
			taxableAmount = enterIncome * IncomeSlabConstants.PERCENTAGE_20;
		}
		return taxableAmount;
	
		
	}
}
