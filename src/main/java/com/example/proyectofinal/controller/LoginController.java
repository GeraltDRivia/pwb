package com.example.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String lg() {
		return "redirect:/login/";
	}

	@GetMapping("/login/")
	public String login() {
		return "Hello";
	}

	@GetMapping("/Inicio")
	public String Inicio() {
		return "Inicio";
	}

	@GetMapping("/Consultas")
	public String Consultas() {
		return "Consultas";
	}

	@GetMapping("/Pago")
	public String Pago() {
		return "Pago";
	}

	@GetMapping("/Transferencias")
	public String Transferencias() {
		return "Transferencias";
	}

	@GetMapping("/Adicionales")
	public String Adicionales() {
		return "Adicionales";
	}

}
