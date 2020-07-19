package com.miniproj.microservices.lengthmultipleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthMultipleController {

	@Autowired
	LengthMultipleRepository repository;
	
	@GetMapping("/length-multiple/from/{from}/to/{to}")
	public LengthMultiple retrieveCoversionMultiple(@PathVariable String from,@PathVariable String to) {
	
		LengthMultiple response = repository.findByFromAndTo(from, to);
		return response;
	}

}
