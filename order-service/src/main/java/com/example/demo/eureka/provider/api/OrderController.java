package com.example.demo.eureka.provider.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
public class OrderController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Welcome Home";
	}
	
	@RequestMapping("/orders")
	public String orderslist() {
		return "you have 10 orders";
		
	}
	

}
