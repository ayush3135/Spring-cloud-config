package com.example.amazon.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class AmazonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonConfigServerApplication.class, args);
	}

}
