package com.example.APIRestAerolinea.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.APIRestAerolinea.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.APIRestAerolinea.models.Destinations;

@RestController
@RequestMapping("/destino")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping
    public ArrayList<Destinations> getDestinos(){
        return this.destinationService.getDestinos();
    }

    @PostMapping
    public Destinations guardarDestino(@RequestBody Destinations destinations){
        return this.destinationService.guardarDestino(destinations);
    } //enviamos request a través del body

    @GetMapping(path = "/{id}")
    public Optional<Destinations> getDestinoById(@PathVariable Long id){
        return this.destinationService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Destinations updateDestinoById(@RequestBody Destinations request, Long id){
        return this.destinationService.updateById(request, id);
    }
}
