package com.linkedlind.curso.springboot.reuniones.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.linkedlind.curso.springboot.reuniones.services.PersonaService;

@Component
@Order(1)
public class DirectorioRunner implements CommandLineRunner {
	/**CommandLineRunner NO es parte del flujo web (MVC), sino de ciclo de arranque de Spring Boot
	*Es una interfaz pensada para ejecutar código justo despúes de que la aplicación se haya arrancado
	*
	*Se usa a menudo para:
	*- Cargar datos de prueba
	*- Ejecutar tareas iniciales
	*- Hacer logs o comprobaciones al iniciar.
	*- Realizar operaciones automáticas al levantar la app
	*
	**/
	
	private static final Logger LOG= LoggerFactory.getLogger(
			DirectorioRunner.class);
	
	@Autowired
	private PersonaService personaService;
	

	// Spring boot detecta automaticamente y ejecuta el método run.. al final del arranque
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Directorio de personas:");
		personaService.getAllPersonas().forEach(persona -> {
			LOG.info(persona.toString());
		});
		LOG.info("Fin del directorio");
	}

	
}
