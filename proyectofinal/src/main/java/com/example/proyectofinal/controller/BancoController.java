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

import com.example.proyectofinal.model.Banco;
import com.example.proyectofinal.service.BancoService;

@RestController
@RequestMapping("/banco/")
public class BancoController {
	
	@Autowired
	private BancoService bancoService;

	@PostMapping
	private ResponseEntity<Banco> guardar(@RequestBody Banco banco) {
		Banco temporal = bancoService.create(banco);

		try {
			return ResponseEntity.created(new URI("/banco/" + temporal.getIdBanco())).body(temporal);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping
	private ResponseEntity<List<Banco>> listarTodosLosBancos() {
		return ResponseEntity.ok(bancoService.getAllBanco());
	}

	@DeleteMapping
	private ResponseEntity<Void> eliminarBanco(@RequestBody Banco banco) {
		bancoService.delete(banco);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Banco>> listarBancosPorID(@PathVariable("id") Long id) {
		return ResponseEntity.ok(bancoService.findById(id));
	}
	

}
