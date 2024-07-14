package com.example.APIRestAerolinea.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.APIRestAerolinea.servicios.DestinosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.APIRestAerolinea.modelos.Destino;
import com.example.APIRestAerolinea.repositorios.DestinoRepository;

@RestController
@RequestMapping("/destino")
public class DestinoController {

    @Autowired
    private DestinosService destinosService;

    @GetMapping
    public ArrayList<Destino> getDestinos(){
        return this.destinosService.getDestinos();
    }

    @PostMapping
    public Destino guardarDestino(@RequestBody Destino destino){
        return this.destinosService.guardarDestino(destino);
    } //enviamos request a través del body

    @GetMapping(path = "/{id}")
    public Optional<Destino> getDestinoById(@PathVariable Long id){
        return this.destinosService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Destino updateDestinoById(@RequestBody Destino request, Long id){
        return this.destinosService.updateById(request, id);
    }
}
