package com.reserve.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ReservationUpdateDataClientApplication {

	public static void main(String[] args) {
		System.out.println("This is Client-Update Data");
		SpringApplication.run(ReservationUpdateDataClientApplication.class, args);
	}

}
