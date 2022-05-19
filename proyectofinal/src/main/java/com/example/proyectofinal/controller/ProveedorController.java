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

import com.example.proyectofinal.model.Proveedor;
import com.example.proyectofinal.service.ProveedorService;

@RestController
@RequestMapping("/proveedor/")
public class ProveedorController {
	
	@Autowired
	private ProveedorService proveedorService;

	@PostMapping
	private ResponseEntity<Proveedor> guardar(@RequestBody Proveedor proveedor) {
		Proveedor temporal = proveedorService.create(proveedor);

		try {
			return ResponseEntity.created(new URI("/proveedor/" + temporal.getIdProveedor())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Proveedor>> listarTodosLosProveedores() {
		return ResponseEntity.ok(proveedorService.getAllProveedor());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarProveedor(@RequestBody Proveedor proveedor) {
		proveedorService.delete(proveedor);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Proveedor>> listarProveedorPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(proveedorService.findById(id));
	}
	

}
