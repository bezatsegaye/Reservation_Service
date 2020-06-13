package mum.edu.et.reservation.domain;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight {
	@Id
	@GeneratedValue
	private long id;
	private String flightnr;
	@Temporal(TemporalType.DATE)
	private Date departureDate;
	@Temporal(TemporalType.TIME)
	private Date departureTime;
	@Temporal(TemporalType.DATE)
	private Date arrivalDate;
	@Temporal(TemporalType.TIME)
	private Date arrivalTime;

	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
			Locale.US);
	private static DateFormat tf = DateFormat.getTimeInstance(DateFormat.SHORT,
			Locale.US);

	/* Constructors */
	public Flight() {
	}

	
}
