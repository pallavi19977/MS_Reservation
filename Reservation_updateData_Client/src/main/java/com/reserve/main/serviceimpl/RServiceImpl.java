package com.reserve.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.reserve.main.model.Reservation;
import com.reserve.main.repository.RRepository;
import com.reserve.main.service.RService;

@Service
public class RServiceImpl implements RService {

	@Autowired
	private RRepository rr;
	
	@Override
	public void update_pas_Data(int rid, Reservation r) {
		
		Optional<Reservation>or=rr.findById(rid);
		if(or.isPresent())
		{
			rr.save(r);
			 
		}else 
		{
			throw new RuntimeException("User with id: " +rid+ " isn't present");
		}
	
	}
	

}
