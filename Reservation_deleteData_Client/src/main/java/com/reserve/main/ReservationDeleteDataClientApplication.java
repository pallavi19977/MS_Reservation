package com.reserve.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ReservationDeleteDataClientApplication {

	public static void main(String[] args) {
		System.out.println("This is Client-DeleteData");
		SpringApplication.run(ReservationDeleteDataClientApplication.class, args);
	}

}
