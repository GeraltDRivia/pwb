package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Asociacion;
import com.example.proyectofinal.repository.AsociacionRepository;

@Service
public class AsociacionService {
	
	@Autowired
	private AsociacionRepository asociacionRepository;
	
	public Asociacion create (Asociacion asociacion) {
		return asociacionRepository.save(asociacion);
	}
	
	public List<Asociacion> getAllAsociacion (){
		return asociacionRepository.findAll();
	}
	
	public void delete (Asociacion asociacion) {
		asociacionRepository.delete(asociacion);
	}
	
	public Optional<Asociacion> findById (Long id) {
		return asociacionRepository.findById(id);
	}

}
