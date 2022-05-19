package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.DetalleServicio;
import com.example.proyectofinal.repository.DetalleServicioRepository;

@Service
public class DetalleServicioService {
	
	@Autowired
	private DetalleServicioRepository detalleServicioRepository;
	
	public DetalleServicio create (DetalleServicio detalleServicio) {
		return detalleServicioRepository.save(detalleServicio);
	}
	
	public List<DetalleServicio> getAllDetalleServicio (){
		return detalleServicioRepository.findAll();
	}
	
	public void delete (DetalleServicio detalleServicio) {
		detalleServicioRepository.delete(detalleServicio);
	}
	
	public Optional<DetalleServicio> findById (Long id) {
		return detalleServicioRepository.findById(id);
	}

}
