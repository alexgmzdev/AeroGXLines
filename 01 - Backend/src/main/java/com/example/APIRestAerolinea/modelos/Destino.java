package com.example.APIRestAerolinea.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*Cambiar a ingles*/
/*preparar unicamente file destinos*/
@Entity
@Table(name="Destinos")
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	public Destino() {
		super();
	}
	
	public Destino(String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
