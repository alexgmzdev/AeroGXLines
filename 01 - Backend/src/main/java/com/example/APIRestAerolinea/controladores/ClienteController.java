package com.example.APIRestAerolinea.controladores;

import com.example.APIRestAerolinea.modelos.Cliente;
import com.example.APIRestAerolinea.servicios.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public ArrayList<Cliente> getClientes(){
        return this.clientesService.getClientes();
    }

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return this.clientesService.guardarCliente(cliente);
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        return this.clientesService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Cliente updateClienteById(@RequestBody Cliente request, Long id){
        return this.clientesService.updateById(request, id);
    }


}
