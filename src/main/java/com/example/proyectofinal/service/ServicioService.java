package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Servicio;
import com.example.proyectofinal.repository.ServicioRepository;

@Service
public class ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	public Servicio create (Servicio servicio) {
		return servicioRepository.save(servicio);
	}
	
	public List<Servicio> getAllServicio (){
		return servicioRepository.findAll();
	}
	
	public void delete (Servicio servicio) {
		servicioRepository.delete(servicio);
	}
	
	public Optional<Servicio> findById (Long id) {
		return servicioRepository.findById(id);
	}

}
