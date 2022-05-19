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

import com.example.proyectofinal.model.DetalleServicio;
import com.example.proyectofinal.service.DetalleServicioService;

@RestController
@RequestMapping("/detalle-servicio/")
public class DetalleServicioController {
	
	@Autowired
	private DetalleServicioService detalleServicioService;

	@PostMapping
	private ResponseEntity<DetalleServicio> guardar(@RequestBody DetalleServicio detalleServicio) {
		DetalleServicio temporal = detalleServicioService.create(detalleServicio);

		try {
			return ResponseEntity.created(new URI("/detalle-servicio/" + temporal.getIdDetalleServicio())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<DetalleServicio>> listarTodosLosDetalleServicios() {
		return ResponseEntity.ok(detalleServicioService.getAllDetalleServicio());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarDetalleServicio(@RequestBody DetalleServicio detalleServicio) {
		detalleServicioService.delete(detalleServicio);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<DetalleServicio>> listarDetalleServiciosPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(detalleServicioService.findById(id));
	}
	

}
