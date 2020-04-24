package com.taxSlab.TaxCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxCalulatorController {

	@Autowired
	TaxCalculatorService taxService;
	
	@GetMapping("/calculateTax/EnterIncome/{enterIncome}")
	public String getTaxSlab(@PathVariable int enterIncome) throws Exception{
		
		double TaxableAmount = taxService.calculateTaxSlab(enterIncome);
		return String.format("Taxble Amount based on entered Imcome is:- %s",TaxableAmount);
				
	}
}
