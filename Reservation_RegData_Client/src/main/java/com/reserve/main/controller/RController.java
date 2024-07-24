package com.reserve.main.controller;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.main.model.Reservation;
import com.reserve.main.service.RService;

@RestController
public class RController {
	
	@Autowired
	private RService rs;
	
	@PostMapping("/regPData")
	public String regData(@RequestBody Reservation r)
	{
		r.setReservationDate(new Date());
		r.setReservationTime(new Time(System.currentTimeMillis()));
		Reservation reg=rs.save(r);
		return "Bus Reservation Done!!";
		
	}
	
}
