package com.example.APIRestAerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.modelos.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
