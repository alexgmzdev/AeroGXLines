package com.example.APIRestAerolinea.controllers;

import com.example.APIRestAerolinea.models.Client;
import com.example.APIRestAerolinea.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<Client> getClients(){
        return this.clientService.getClients();
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return this.clientService.saveClient(client);
    }

    @GetMapping(path = "/{id}")
    public Optional<Client> getClientById(@PathVariable Long id){
        return this.clientService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Client updateClientById(@RequestBody Client request, Long id){
        return this.clientService.updateById(request, id);
    }


}
