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

import com.example.proyectofinal.model.Producto;
import com.example.proyectofinal.service.ProductoService;

@RestController
@RequestMapping("/producto/")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	@PostMapping
	private ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
		Producto temporal = productoService.create(producto);

		try {
			return ResponseEntity.created(new URI("/producto/" + temporal.getIdProducto())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Producto>> listarTodosLosProductos() {
		return ResponseEntity.ok(productoService.getAllProducto());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarProducto(@RequestBody Producto producto) {
		productoService.delete(producto);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Producto>> listarProductosPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(productoService.findById(id));
	}
	

}
