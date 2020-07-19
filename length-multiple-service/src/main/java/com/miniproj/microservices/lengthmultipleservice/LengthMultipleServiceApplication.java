package com.miniproj.microservices.lengthmultipleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LengthMultipleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LengthMultipleServiceApplication.class, args);
	}

}
