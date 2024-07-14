package com.example.APIRestAerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.APIRestAerolinea.modelos.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long>{

}
