package com.example.APIRestAerolinea.controllers;

import com.example.APIRestAerolinea.models.Client;
import com.example.APIRestAerolinea.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<Client> getClientes(){
        return this.clientService.getClientes();
    }

    @PostMapping
    public Client guardarCliente(@RequestBody Client client){
        return this.clientService.guardarCliente(client);
    }

    @GetMapping(path = "/{id}")
    public Optional<Client> getClienteById(@PathVariable Long id){
        return this.clientService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Client updateClienteById(@RequestBody Client request, Long id){
        return this.clientService.updateById(request, id);
    }


}
