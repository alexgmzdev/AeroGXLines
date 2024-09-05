package com.example.APIRestAerolinea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.models.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
