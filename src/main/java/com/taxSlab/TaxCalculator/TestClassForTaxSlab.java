package com.taxSlab.TaxCalculator;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestClassForTaxSlab {		
	
	TaxCalculatorService taxCalculatorService = new TaxCalculatorService();

	@Before  
	public void setUp() throws Exception {  
		System.out.println("Before method..");  
	}  
	
	@Test
	public void testTaxSlabCalculator() throws Exception{
		double result1 = taxCalculatorService.calculateTaxSlab(1);
		assertEquals(1.0, result1, 0.0);
		//assertEquals(10000.0, 10000.0,result1);
		
		double result2 = taxCalculatorService.calculateTaxSlab(10000);
		assertEquals(1.0, result2, 0.0);	
				
		double result3 = taxCalculatorService.calculateTaxSlab(10001);
		assertEquals(1001.1, result3, 0.0);	
		
		double result4 = taxCalculatorService.calculateTaxSlab(10001);
		assertEquals(1000.1, result4, 0.0);	
		
		double result5 = taxCalculatorService.calculateTaxSlab(20050);
		assertEquals(4010.0, result5, 0.0);	
	}
	
	@After  
	public void tearDown() throws Exception {  
		System.out.println("After method..");  
	}  
	

}
