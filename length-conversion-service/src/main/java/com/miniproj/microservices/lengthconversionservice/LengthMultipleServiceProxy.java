package com.miniproj.microservices.lengthconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="length-multiple-service")
@RibbonClient(name="length-multiple-service")
public interface LengthMultipleServiceProxy {

	@GetMapping("/length-multiple/from/{from}/to/{to}")
	public LengthConversionBean retrieveCoversionMultiple(@PathVariable String from,@PathVariable String to); 

}
