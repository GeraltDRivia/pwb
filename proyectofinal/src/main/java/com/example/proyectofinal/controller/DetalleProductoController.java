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

import com.example.proyectofinal.model.DetalleProducto;
import com.example.proyectofinal.service.DetalleProductoService;

@RestController
@RequestMapping("/detalle-producto/")
public class DetalleProductoController {
	
	@Autowired
	private DetalleProductoService detalleProductoService;

	@PostMapping
	private ResponseEntity<DetalleProducto> guardar(@RequestBody DetalleProducto detalleProducto) {
		DetalleProducto temporal = detalleProductoService.create(detalleProducto);

		try {
			return ResponseEntity.created(new URI("/detalle-producto/" + temporal.getIdDetalleProducto())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<DetalleProducto>> listarTodosLosDetalleProductos() {
		return ResponseEntity.ok(detalleProductoService.getAllDetalleProducto());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarDetalleProducto(@RequestBody DetalleProducto detalleProducto) {
		detalleProductoService.delete(detalleProducto);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<DetalleProducto>> listarDetalleProductosPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(detalleProductoService.findById(id));
	}
	

}
