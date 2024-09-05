package com.example.APIRestAerolinea.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Airline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idAirline;
	String airlineName;
	
	public Airline() {
		super();
	}
	
	public Airline(Long idAirline, String airlineName) {
		super();
		this.idAirline = idAirline;
		this.airlineName = airlineName;
	}

	public Long getIdAirline() {
		return idAirline;
	}
	public void setIdAirline(Long idAirline) {
		this.idAirline = idAirline;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	
}
