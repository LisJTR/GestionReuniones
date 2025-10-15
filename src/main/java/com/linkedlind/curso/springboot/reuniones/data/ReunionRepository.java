package com.linkedlind.curso.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkedlind.curso.springboot.reuniones.model.Reunion;



public interface ReunionRepository extends JpaRepository<Reunion, Long> {

}
