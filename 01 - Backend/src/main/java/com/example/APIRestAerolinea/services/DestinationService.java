package com.example.APIRestAerolinea.services;

import com.example.APIRestAerolinea.models.Destinations;
import com.example.APIRestAerolinea.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired
    DestinationRepository destinationRepository;

    public ArrayList<Destinations> getDestinations(){
        return (ArrayList<Destinations>) destinationRepository.findAll();
    }

    public Destinations saveDestination(Destinations destinations){
        return destinationRepository.save(destinations);
    }

    public Optional<Destinations> getById(Long id){
        return destinationRepository.findById(id);
    }

    public Destinations updateById(Destinations request, Long id){
        Destinations destinations = destinationRepository.findById(id).get();

        destinations.setDestinationName(request.getDestinationName());
        return destinations;
    }

}
