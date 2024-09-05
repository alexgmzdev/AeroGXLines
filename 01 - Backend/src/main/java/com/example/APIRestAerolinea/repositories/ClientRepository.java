package com.example.APIRestAerolinea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.models.Client;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
