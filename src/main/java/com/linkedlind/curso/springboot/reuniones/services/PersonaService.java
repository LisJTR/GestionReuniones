package com.linkedlind.curso.springboot.reuniones.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.linkedlind.curso.springboot.reuniones.data.PersonaRepository;
import com.linkedlind.curso.springboot.reuniones.model.Persona;

@Service // Indica que la clase es una lógica de negocio
public class PersonaService {
	
		
	private final PersonaRepository personaRepository;
		
		public PersonaService(PersonaRepository personaRepository) {
			this.personaRepository = personaRepository;
		}
	
		public List<Persona> getAllPersonas() {
			return personaRepository.findAll();
		}
}
