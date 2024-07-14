package com.example.APIRestAerolinea.servicios;

import com.example.APIRestAerolinea.modelos.Destino;
import com.example.APIRestAerolinea.repositorios.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DestinosService {

    @Autowired
    DestinoRepository destinoRepository;

    public ArrayList<Destino> getDestinos(){
        return (ArrayList<Destino>) destinoRepository.findAll();
    }

    public Destino guardarDestino(Destino destino){
        return destinoRepository.save(destino);
    }

    public Optional<Destino> getById(Long id){
        return destinoRepository.findById(id);
    }

    public Destino updateById(Destino request, Long id){
        Destino destino = destinoRepository.findById(id).get();

        destino.setNombre(request.getNombre());
        return destino;
    }

}
