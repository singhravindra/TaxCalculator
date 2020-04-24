package com.taxSlab.TaxCalculator;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class TaxCalculatorApplicationTests {

	@LocalServerPort
    int randomServerPort;	

	@Test
	public void testcalculateTaxSlabSuccess() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		
		final String baseUrl = "http://localhost:" + randomServerPort + "/calculateTax/EnterIncome";
	    URI uri = new URI(baseUrl);
		
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    
	}
	
}
