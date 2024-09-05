package com.example.APIRestAerolinea.controllers;

import com.example.APIRestAerolinea.models.Ticket;
import com.example.APIRestAerolinea.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/billete")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ArrayList<Ticket> getTickets(){
        return this.ticketService.getTickets();
    }

    @PostMapping
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return this.ticketService.saveTicket(ticket);
    }

    @GetMapping(path = "/{id}")
    public Optional<Ticket> getTicketById(@PathVariable Long id){
        return this.ticketService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Ticket updateTicketById(@RequestBody Ticket request, Long id){
        return this.ticketService.updateById(request, id);
    }
}
