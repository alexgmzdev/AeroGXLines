package com.example.APIRestAerolinea.controladores;

import com.example.APIRestAerolinea.modelos.Billete;
import com.example.APIRestAerolinea.modelos.Destino;
import com.example.APIRestAerolinea.servicios.BilleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/billete")
public class BilleteController {

    @Autowired
    private BilleteService billeteService;

    @GetMapping
    public ArrayList<Billete> getBilletes(){
        return this.billeteService.getBilletes();
    }

    @PostMapping
    public Billete guardarBillete(@RequestBody Billete billete){
        return this.billeteService.guardarBillete(billete);
    }

    @GetMapping(path = "/{id}")
    public Optional<Billete>getBilleteById(@PathVariable Long id){
        return this.billeteService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Billete updateBilleteById(@RequestBody Billete request, Long id){
        return this.billeteService.updateById(request, id);
    }
}
