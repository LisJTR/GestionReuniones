package com.linkedlind.curso.springboot.reuniones.tasks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.linkedlind.curso.springboot.reuniones.services.ReunionService;

@Component
@Order(2)
public class AgendaRunner implements ApplicationRunner {
	
	/**
	 * CommandLineRunner y ApplicationRunner ejecutan código al arrancar la aplicación.
	 * La única diferenciareal es cómo reciben los argumentos: 
	 * uno como texto (String[]) y ApplicationRunner recibe los argumentos como objeto ApplicationArguments,
	 * lo que facilita acceder a ellos (más moderno y flexible).
	 */

	private static final Logger LOG = LoggerFactory.getLogger(
			AgendaRunner.class);
	
	@Autowired
	private ReunionService reunionService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Lista de reuniones:");
		reunionService.getAllReuniones().forEach(reunion -> {
				LOG.info(reunion.toString());
	});
	LOG.info("Fin del listado");
		
	}


}
