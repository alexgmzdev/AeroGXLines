package com.example.APIRestAerolinea.servicios;

import com.example.APIRestAerolinea.modelos.Cliente;
import com.example.APIRestAerolinea.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class ClientesService {

    @Autowired
    ClienteRepository clientesRepository;

    public ArrayList<Cliente> getClientes(){
        return (ArrayList<Cliente>) clientesRepository.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){
        return clientesRepository.save(cliente);
    }

    public Optional<Cliente> getById(Long id){
        return clientesRepository.findById(id);
    }

    public Cliente updateById (Cliente request, Long id){
        Cliente cliente = clientesRepository.findById(id).get();

        cliente.setEmail(request.getEmail());
        return cliente;
    }
}
