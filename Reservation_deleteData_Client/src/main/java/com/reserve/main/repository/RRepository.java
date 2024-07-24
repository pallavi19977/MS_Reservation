package com.reserve.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reserve.main.model.Reservation;

@Repository
public interface RRepository extends JpaRepository<Reservation, Integer>{
	
	public void deleteByRid(int rid);
}
