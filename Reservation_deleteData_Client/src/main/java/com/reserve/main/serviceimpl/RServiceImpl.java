package com.reserve.main.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.reserve.main.repository.RRepository;
import com.reserve.main.service.RService;

@Service
public class RServiceImpl implements RService {

	@Autowired
	private RRepository rr;
	@Override
	public void deleteIdData(int rid) {
		rr.deleteById(rid);
		
	}

}
