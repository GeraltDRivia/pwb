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

import com.example.proyectofinal.model.Servicio;
import com.example.proyectofinal.service.ServicioService;

@RestController
@RequestMapping("/servicio/")
public class ServicioController {
	
	@Autowired
	private ServicioService servicioService;

	@PostMapping
	private ResponseEntity<Servicio> guardar(@RequestBody Servicio servicio) {
		Servicio temporal = servicioService.create(servicio);

		try {
			return ResponseEntity.created(new URI("/servicio/" + temporal.getIdServicio())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Servicio>> listarTodosLosServicios() {
		return ResponseEntity.ok(servicioService.getAllServicio());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarServicio(@RequestBody Servicio servicio) {
		servicioService.delete(servicio);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Servicio>> listarServicioPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(servicioService.findById(id));
	}
	

}
