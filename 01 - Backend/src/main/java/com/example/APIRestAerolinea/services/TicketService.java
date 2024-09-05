package com.example.APIRestAerolinea.services;


import com.example.APIRestAerolinea.models.Ticket;
import com.example.APIRestAerolinea.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    public ArrayList<Ticket> getTickets(){
        return (ArrayList<Ticket>) ticketRepository.findAll();
    }

    public Ticket saveTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> getById (Long id){
        return ticketRepository.findById(id);
    }

    public Ticket updateById(Ticket request, Long id){
        Ticket ticket = ticketRepository.findById(id).get();

        ticket.setEquipajeFacturado(request.isEquipajeFacturado());
        return ticket;
    }
}
