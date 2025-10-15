package com.linkedlind.curso.springboot.reuniones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;

@SpringBootApplication // Marca la clase principal que arranca tu aplicación.
public class ReunionesApplication {

	public static void main(String[] args) {
		
		/**
		 * La anotación @SpringBootAplication es un conjunto de tres anotaciones:
		 * 
		 * - @Configuration: indica que esta clase puede contener beans de configuración
		 * - @EnableAutoConfiguration: activa la configuración automática de Spring Boot
		 * - @ComponentScan: hace que Spring busque clases con anotaciones, dentro del paquete actual
		 * 
		 */
		
		SpringApplication.run(ReunionesApplication.class, args);
	}
	

}
