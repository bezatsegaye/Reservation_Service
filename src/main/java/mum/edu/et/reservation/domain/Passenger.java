package mum.edu.et.reservation.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	@Temporal(TemporalType.DATE)
	private Date dateofbirth;
	@Embedded
	@AttributeOverrides( {
		@AttributeOverride(name="street", column=@Column(name="email_street")),
		@AttributeOverride(name="city", column=@Column(name="email_city")),
		@AttributeOverride(name="state", column=@Column(name="email_state")),
		@AttributeOverride(name="zip", column=@Column(name="email_zip"))
		})
	private PassengerAddress email;
	@Embedded
	@AttributeOverrides( {
		@AttributeOverride(name="street", column=@Column(name="residence_street")),
		@AttributeOverride(name="city", column=@Column(name="residence_city")),
		@AttributeOverride(name="state", column=@Column(name="residence_state")),
		@AttributeOverride(name="zip", column=@Column(name="residence_zip"))
		})
	private PassengerAddress residence;
}
