package com.miniproj.microservices.lengthconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.miniproj.microservices.lengthconversionservice")
public class LengthConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LengthConversionServiceApplication.class, args);
	}

}
