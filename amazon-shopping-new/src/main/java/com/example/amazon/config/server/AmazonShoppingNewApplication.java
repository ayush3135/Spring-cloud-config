package com.example.amazon.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class AmazonShoppingNewApplication {

	 @LoadBalanced
    @Bean
   RestTemplate loadBalanced() {
	        return new RestTemplate();
    }

	    @Primary
	    //@LoadBalanced
	    @Bean
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingNewApplication.class, args);
	}

}
