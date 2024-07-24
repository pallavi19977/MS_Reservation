package com.reserve.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.main.model.Reservation;
import com.reserve.main.service.RService;

@RestController
public class RController {
	
	@Autowired
	private RService rs;
	
	@PutMapping("/updatePData")
	public ResponseEntity<String> update_pas_Data(@PathVariable int rid,
														@RequestBody Reservation r)
	{
		rs.update_pas_Data(rid,r);
		return new ResponseEntity<String> ("DataUpdated..",HttpStatus.OK);
		
	}
	
}
