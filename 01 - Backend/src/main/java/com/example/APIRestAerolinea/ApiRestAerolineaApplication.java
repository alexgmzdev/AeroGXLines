package com.example.APIRestAerolinea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.APIRestAerolinea.controllers")
@ComponentScan(basePackages = "com.example.APIRestAerolinea.models")
@ComponentScan(basePackages = "com.example.APIRestAerolinea.repositories")
@ComponentScan(basePackages = "com.example.APIRestAerolinea.services")
public class ApiRestAerolineaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestAerolineaApplication.class, args);
	}

}
