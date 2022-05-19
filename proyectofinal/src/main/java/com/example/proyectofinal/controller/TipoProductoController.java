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

import com.example.proyectofinal.model.TipoProducto;
import com.example.proyectofinal.service.TipoProductoService;

@RestController
@RequestMapping("/tipo-producto/")
public class TipoProductoController {
	
	@Autowired
	private TipoProductoService tipoProductoService;

	@PostMapping
	private ResponseEntity<TipoProducto> guardar(@RequestBody TipoProducto tipoProducto) {
		TipoProducto temporal = tipoProductoService.create(tipoProducto);

		try {
			return ResponseEntity.created(new URI("/tipo-producto/" + temporal.getIdTipoProducto())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<TipoProducto>> listarTodosLosTipoProductos() {
		return ResponseEntity.ok(tipoProductoService.getAllTipoProducto());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarTipoProducto(@RequestBody TipoProducto tipoProducto) {
		tipoProductoService.delete(tipoProducto);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<TipoProducto>> listarTipoProductoPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(tipoProductoService.findById(id));
	}
	

}
