package com.example.APIRestAerolinea.models;

import jakarta.persistence.*;

@Entity
@Table(name= "Tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idTicket;
	String ticketDate;
	String buyDate;
	String origin;
	String destination;
	String seatNumber;
	boolean equipajeFacturado;
	
	public Ticket() {
		super();
	}
	
	
	
	public Ticket(Long idTicket, String ticketDate, String buyDate, String origin, String destination, String seatNumber,
				  boolean equipajeFacturado) {
		super();
		this.idTicket = idTicket;
		this.ticketDate = ticketDate;
		this.buyDate = buyDate;
		this.origin = origin;
		this.destination = destination;
		this.seatNumber = seatNumber;
		this.equipajeFacturado = equipajeFacturado;
	}



	public Long getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(Long idTicket) {
		this.idTicket = idTicket;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isEquipajeFacturado() {
		return equipajeFacturado;
	}
	public void setEquipajeFacturado(boolean equipajeFacturado) {
		this.equipajeFacturado = equipajeFacturado;
	}
	
	

}
