package com.example.APIRestAerolinea.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.APIRestAerolinea.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.APIRestAerolinea.models.Destinations;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping
    public ArrayList<Destinations> getDestinations(){
        return this.destinationService.getDestinations();
    }

    @PostMapping
    public Destinations saveDestination(@RequestBody Destinations destinations){
        return this.destinationService.saveDestination(destinations);
    } //enviamos request a través del body

    @GetMapping(path = "/{id}")
    public Optional<Destinations> getDestinationById(@PathVariable Long id){
        return this.destinationService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Destinations updateDestinationById(@RequestBody Destinations request, Long id){
        return this.destinationService.updateById(request, id);
    }
}
