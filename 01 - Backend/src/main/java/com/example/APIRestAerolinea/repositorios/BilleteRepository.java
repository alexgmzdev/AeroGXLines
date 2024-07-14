package com.example.APIRestAerolinea.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIRestAerolinea.modelos.Billete;

public interface BilleteRepository extends JpaRepository<Billete, Long> {

}
