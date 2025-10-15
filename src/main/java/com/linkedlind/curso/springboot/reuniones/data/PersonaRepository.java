package com.linkedlind.curso.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkedlind.curso.springboot.reuniones.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}