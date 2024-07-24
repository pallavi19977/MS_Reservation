package com.reserve.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reserve.main.model.Reservation;

@Repository
public interface RRepository extends CrudRepository<Reservation , Integer>{

}
