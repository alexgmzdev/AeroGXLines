package com.example.APIRestAerolinea.services;

import com.example.APIRestAerolinea.models.Client;
import com.example.APIRestAerolinea.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientesRepository;

    public ArrayList<Client> getClientes(){
        return (ArrayList<Client>) clientesRepository.findAll();
    }

    public Client guardarCliente(Client client){
        return clientesRepository.save(client);
    }

    public Optional<Client> getById(Long id){
        return clientesRepository.findById(id);
    }

    public Client updateById (Client request, Long id){
        Client client = clientesRepository.findById(id).get();

        client.setEmail(request.getEmail());
        return client;
    }
}
