package com.example.APIRestAerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
