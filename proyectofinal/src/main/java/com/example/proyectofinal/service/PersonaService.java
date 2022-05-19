package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Persona;
import com.example.proyectofinal.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public Persona create (Persona persona) {
		return personaRepository.save(persona);
	}
	
	public List<Persona> getAllPersona (){
		return personaRepository.findAll();
	}
	
	public void delete (Persona persona) {
		personaRepository.delete(persona);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaRepository.findById(id);
	}

}
