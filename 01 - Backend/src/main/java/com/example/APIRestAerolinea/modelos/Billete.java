package com.example.APIRestAerolinea.modelos;

import jakarta.persistence.*;

@Entity
@Table(name= "Billetes")
public class Billete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String fechaBillete;
	String fechaCompra;
	String origen;
	String destino;
	String asiento;
	boolean equipajeFacturado;
	
	public Billete() {
		super();
	}
	
	
	
	public Billete(Long id, String fechaBillete, String fechaCompra, String origen, String destino, String asiento,
			boolean equipajeFacturado) {
		super();
		this.id = id;
		this.fechaBillete = fechaBillete;
		this.fechaCompra = fechaCompra;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.equipajeFacturado = equipajeFacturado;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFechaBillete() {
		return fechaBillete;
	}
	public void setFechaBillete(String fechaBillete) {
		this.fechaBillete = fechaBillete;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getAsiento() {
		return asiento;
	}
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	public boolean isEquipajeFacturado() {
		return equipajeFacturado;
	}
	public void setEquipajeFacturado(boolean equipajeFacturado) {
		this.equipajeFacturado = equipajeFacturado;
	}
	
	

}
