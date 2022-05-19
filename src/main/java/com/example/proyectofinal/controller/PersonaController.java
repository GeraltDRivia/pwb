package com.example.proyectofinal.controller;

import java.net.URI;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectofinal.model.Persona;
import com.example.proyectofinal.service.PersonaService;

@RestController
@RequestMapping("/persona/")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;

	@PostMapping
	private ResponseEntity<Persona> guardar(@RequestBody Persona detalleServicio) {
		Persona temporal = personaService.create(detalleServicio);

		try {
			return ResponseEntity.created(new URI("/persona/" + temporal.getIdPersona())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Persona>> listarTodasLasPersonas() {
		return ResponseEntity.ok(personaService.getAllPersona());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarPersona(@RequestBody Persona detalleServicio) {
		personaService.delete(detalleServicio);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Persona>> listarPersonasPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(personaService.findById(id));
	}
	

}
