package com.example.amazon.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient 
public class PaymentServiceNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceNewApplication.class, args);
	}

}
