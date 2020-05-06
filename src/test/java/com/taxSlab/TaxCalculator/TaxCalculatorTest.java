package com.taxSlab.TaxCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

public class TaxCalculatorTest {		

	TaxCalculatorService taxCalculatorService = new TaxCalculatorService();

	@Before  
	public void setUp() throws Exception {  
		System.out.println("Calling before the test method..");  
	}  

	@Test
	public void testTaxSlabCalculator() throws Exception{
		double result1 = taxCalculatorService.calculateTaxSlab(1);
		assertEquals(1.0, result1, 0.0);	// Pass case

		double result2 = taxCalculatorService.calculateTaxSlab(10000);
		assertEquals(10000.0, result2, 0.0);	// Pass case

		double result3 = taxCalculatorService.calculateTaxSlab(10001);
		assertEquals(1000.1, result3, 0.0);		// pass case

		double result4 = taxCalculatorService.calculateTaxSlab(20000);
		assertEquals(2000.0, result4, 0.0);		// Pass Case

		double result5 = taxCalculatorService.calculateTaxSlab(20050);
		assertEquals(4010.0, result5, 0.0);	  // Pass case

		double result6 = taxCalculatorService.calculateTaxSlab(50000);
		assertEquals(5.0, result6, 0.0);	  // Fail case

		double result7 = taxCalculatorService.calculateTaxSlab(9000);
		assertEquals(930.0, result7, 0.0);	  // Fail case
	}

	@After  
	public void tearDown() throws Exception {  
		System.out.println("Calling after the test method..");  
	}  


}
