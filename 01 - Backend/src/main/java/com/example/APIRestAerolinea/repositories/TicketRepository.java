package com.example.APIRestAerolinea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.models.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
