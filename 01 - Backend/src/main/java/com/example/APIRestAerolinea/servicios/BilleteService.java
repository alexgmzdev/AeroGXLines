package com.example.APIRestAerolinea.servicios;


import com.example.APIRestAerolinea.modelos.Billete;
import com.example.APIRestAerolinea.modelos.Destino;
import com.example.APIRestAerolinea.repositorios.BilleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BilleteService {

    @Autowired
    BilleteRepository billeteRepository;

    public ArrayList<Billete> getBilletes(){
        return (ArrayList<Billete>) billeteRepository.findAll();
    }

    public Billete guardarBillete(Billete billete){
        return billeteRepository.save(billete);
    }

    public Optional<Billete> getById (Long id){
        return billeteRepository.findById(id);
    }

    public Billete updateById(Billete request, Long id){
        Billete billete = billeteRepository.findById(id).get();

        billete.setEquipajeFacturado(request.isEquipajeFacturado());
        return billete;
    }
}
