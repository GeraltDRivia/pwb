package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.TipoProducto;
import com.example.proyectofinal.repository.TipoProductoRepository;

@Service
public class TipoProductoService {
	
	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	public TipoProducto create (TipoProducto tipoProducto) {
		return tipoProductoRepository.save(tipoProducto);
	}
	
	public List<TipoProducto> getAllTipoProducto (){
		return tipoProductoRepository.findAll();
	}
	
	public void delete (TipoProducto tipoProducto) {
		tipoProductoRepository.delete(tipoProducto);
	}
	
	public Optional<TipoProducto> findById (Long id) {
		return tipoProductoRepository.findById(id);
	}

}
