package com.example.APIRestAerolinea.models;

import jakarta.persistence.*;

@Entity
@Table(name= "Clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idClients;
	String nif;
	String clientName;
	String clientLastname;
	String phoneNumber;
	String email;
	
	public Client() {
		super();
	}
	
	public Client(Long idClients, String nif, String clientName, String clientLastname, String phoneNumber, String email) {
		super();
		this.nif = nif;
		this.clientName = clientName;
		this.clientLastname = clientLastname;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Long getIdClients() {
		return idClients;
	}

	public void setIdClients(Long idClients) {
		this.idClients = idClients;
	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientLastname() {
		return clientLastname;
	}
	public void setClientLastname(String clientLastname) {
		this.clientLastname = clientLastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
