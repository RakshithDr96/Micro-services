package com.miniproj.microservices.lengthconversionservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthConversionController {
	
	@Autowired
	LengthMultipleServiceProxy proxy;

	@GetMapping("/length-convert/from/{from}/to/{to}/quantity/{quantity}")
	public String returnCalculation(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
		LengthConversionBean response = proxy.retrieveCoversionMultiple(from,to);
		return "The value in "+to+" is "+quantity.multiply(response.getConversion_Multiple());
	}
}
