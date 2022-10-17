package com.example.amazon.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DermoServerEurekaCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DermoServerEurekaCloudConfigApplication.class, args);
	}

}
