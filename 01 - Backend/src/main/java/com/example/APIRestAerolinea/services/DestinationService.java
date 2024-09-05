package com.example.APIRestAerolinea.services;

import com.example.APIRestAerolinea.models.Destinations;
import com.example.APIRestAerolinea.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DestinationService {


    private DestinationRepository DestinationRepo;

    @Autowired //For unit test
    public DestinationService(DestinationRepository DestinationRepo){

    }

    public ArrayList<Destinations> getDestinations(){
        return (ArrayList<Destinations>) DestinationRepo.findAll();
    }

    public Destinations saveDestination(Destinations destinations){
        return DestinationRepo.save(destinations);
    }

    public Optional<Destinations> getById(Long id){
        return DestinationRepo.findById(id);
    }

    public Destinations updateById(Destinations request, Long id){
        Destinations destinations = DestinationRepo.findById(id).get();

        destinations.setDestinationName(request.getDestinationName());
        return destinations;
    }

}
