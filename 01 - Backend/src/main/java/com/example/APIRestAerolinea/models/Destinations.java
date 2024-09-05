package com.example.APIRestAerolinea.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*Cambiar a ingles*/
/*preparar unicamente file destinos*/
@Entity
@Table(name="Destination")
public class Destinations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestination;
	private String destinationName;

	private String destinationCountry;

	/****************CONSTRUCTORS****************/
	public Destinations() {
		super();
	}
	
	public Destinations(String destinationName) {
		super();
		this.idDestination = idDestination;
		this.destinationName = destinationName;
		this.destinationCountry = destinationCountry;
	}
	/****************GETTERS AND SETTERS****************/
	public long getIdDestination() {
		return idDestination;
	}
	public void setIdDestination(long idDestination) {
		this.idDestination = idDestination;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

}
