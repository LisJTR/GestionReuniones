package com.linkedlind.curso.springboot.reuniones.services;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.linkedlind.curso.springboot.reuniones.data.ReunionRepository;
import com.linkedlind.curso.springboot.reuniones.model.Persona;
import com.linkedlind.curso.springboot.reuniones.model.Reunion;

@Service
public class ReunionService {
	
	private final ReunionRepository reunionRepository;
	
	public ReunionService(ReunionRepository reunionRepository) {
		this.reunionRepository = reunionRepository;
	}



	public List<Reunion> getAllReuniones(){
		return reunionRepository.findAll();
	}

}
