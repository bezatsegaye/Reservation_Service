package mum.edu.et.reservation.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ticket {
	@Id
	private long id;
	private String number;
	private String reservatiocode;
	@Temporal(TemporalType.DATE)
	private Date flightdate;
	@OneToOne(cascade = CascadeType.ALL)
	private Passenger passenger;
	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;
	

}
