package com.example.APIRestAerolinea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.APIRestAerolinea.models.Destinations;

@Repository
public interface DestinationRepository extends JpaRepository<Destinations, Long>{

}
