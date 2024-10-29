package com.example.resturantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ResturantserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturantserviceApplication.class, args);
	}

}
