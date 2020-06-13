package mum.edu.et.reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.et.reservation.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
