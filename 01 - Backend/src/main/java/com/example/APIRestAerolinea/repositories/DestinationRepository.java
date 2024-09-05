package com.example.APIRestAerolinea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.APIRestAerolinea.models.Destinations;

import java.util.List;

@Repository
public interface DestinationRepository extends JpaRepository<Destinations, Long>{
    List<Destinations> findByCountry(String destinationCountry);
    List<Destinations> findByName(String destinationName);
}
