package com.reserve.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservationRegDataClientApplication {

	public static void main(String[] args) {
		System.out.println("This is Client-RegisterData");
		SpringApplication.run(ReservationRegDataClientApplication.class, args);
	}

}
