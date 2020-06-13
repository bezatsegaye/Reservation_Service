package mum.edu.et.reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.et.reservation.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
