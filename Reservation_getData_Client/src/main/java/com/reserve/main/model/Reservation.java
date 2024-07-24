package com.reserve.main.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rid;
	private String pname;
	private long pcontact;
	private String pemail;
	private int page;
	private String pgender;
	@Temporal(TemporalType.DATE)
	private Date reservationDate;
	@Temporal(TemporalType.TIME)
	private Time reservationTime;
}
