package com.reserve.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.main.service.RService;

@RestController
public class RController {

	@Autowired
	private RService rs;
	@GetMapping("/getPData")
	public List getAllPData()
	{
		List al=rs.getAllPData();
		return al;
	}
}
