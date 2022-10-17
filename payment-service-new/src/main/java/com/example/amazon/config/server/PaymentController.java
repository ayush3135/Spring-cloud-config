package com.example.amazon.config.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
	
	@RequestMapping("/")
	public String home() {
		return "Welcome Home";
	}
	
	@RequestMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "payment with " + price+ " is successful" ;
	}
	
	@RequestMapping("/retry")
	public String retry() {
		return "payment failed" ;
	}

}
