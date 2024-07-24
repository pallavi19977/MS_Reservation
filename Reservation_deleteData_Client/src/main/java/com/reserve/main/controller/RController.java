package com.reserve.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.main.service.RService;

@RestController
public class RController {

	@Autowired
	private RService rs;
	
	@DeleteMapping("/deleteSingleData/{rid}")
	public String deletePData(@PathVariable("rid") int rid)
	{
		rs.deleteIdData(rid);
		return "Deleted Successfully....!!";
	}
}
