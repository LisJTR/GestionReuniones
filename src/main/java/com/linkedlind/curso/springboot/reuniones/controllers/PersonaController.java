package com.linkedlind.curso.springboot.reuniones.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.linkedlind.curso.springboot.reuniones.services.PersonaService;


@Controller // Define una clase como controlador MVC - Devuelve vistas HTML (Thymeleaf, JSP...)
@RequestMapping("/personas") // Define la ruta base o un endpoint
public class PersonaController {
	
	@Autowired // inyecta automaticamente un bean gestionado por Spring, busca clases marcadas con @Componet, @Service...
	private PersonaService personaService;
	
	@GetMapping // Get, petición HTTP
	public String getAllReuniones(Model model) {
		model.addAttribute("personas", personaService.getAllPersonas());
		return "personas"; // busca en la carpeta templates la vistas html
	}

}
