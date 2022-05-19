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

import com.example.proyectofinal.model.Asociacion;
import com.example.proyectofinal.service.AsociacionService;

@RestController
@RequestMapping("/asociacion/")
public class AsociacionController {
	
	@Autowired
	private AsociacionService asociacionService;

	@PostMapping
	private ResponseEntity<Asociacion> guardar(@RequestBody Asociacion asociacion) {
		Asociacion temporal = asociacionService.create(asociacion);

		try {
			return ResponseEntity.created(new URI("/asociacion/" + temporal.getIdAsociacion())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Asociacion>> listarTodasLasPersona() {
		return ResponseEntity.ok(asociacionService.getAllAsociacion());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarAsociacion(@RequestBody Asociacion asociacion) {
		asociacionService.delete(asociacion);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Asociacion>> listarAsociacionsPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(asociacionService.findById(id));
	}
	

}
