package com.linkedlind.curso.springboot.reuniones.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkedlind.curso.springboot.reuniones.model.Persona;
import com.linkedlind.curso.springboot.reuniones.services.PersonaService;

@RestController // Similar a @Controller, pero devuelve datos (JSON o XML) en lugar de vistas
@RequestMapping("/api/personas")
public class PersonaRestController {
	
	private PersonaService personaService;

	public PersonaRestController(PersonaService personaService) {
		this.personaService = personaService;
	}
	
	@GetMapping
	public List<Persona> getAllPersonas(){
		return personaService.getAllPersonas();
	}

}
