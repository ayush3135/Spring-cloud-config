package com.example.amazon.config.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RefreshScope
public class ShoppingController {
	
	@Autowired
	@Lazy
	private RestTemplate template;
	
	 @Autowired
	    @LoadBalanced
	    private RestTemplate loadBalanced;
	
	
	@Value("${payment.service.url}") private String paymentUrl; 
	  
	  @Value("${order.service.url}") private String orderUrl;
	 

	@RequestMapping("/")
	public String home() {
		return "Welcome Home";
	}

	@RequestMapping("/amazon-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		String url =paymentUrl+price;
		System.out.println(url);		//WebClient client = WebClient.create(url);
		return template.getForObject(url, String.class);
		//return client;
	}
	
	@RequestMapping("/amazon-payment/retry")
	public String invokeRetryPaymentService() {
		String url ="http://PAYMENT-SERVICE/payment-provider/retry";
		//WebClient client = WebClient.create(url);
		return template.getForObject(url, String.class);
		//return client;
	}
	
	@RequestMapping("/amazon-payment/orders")
	public String invokeOrdersPaymentService() {
		String url ="http://ORDER-SERVICE/order-service/orders";
		//WebClient client = WebClient.create(url);
		System.out.println(orderUrl);
		return template.getForObject(orderUrl, String.class);
		//return client;
	}
	
}
