package com.f2d.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class F2dMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(F2dMiddlewareApplication.class, args);
	}

}
