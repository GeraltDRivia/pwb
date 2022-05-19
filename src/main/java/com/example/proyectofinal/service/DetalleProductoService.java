package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.DetalleProducto;
import com.example.proyectofinal.repository.DetalleProductoRepository;

@Service
public class DetalleProductoService {
	
	@Autowired
	private DetalleProductoRepository detalleProductoRepository;
	
	public DetalleProducto create (DetalleProducto detalleProducto) {
		return detalleProductoRepository.save(detalleProducto);
	}
	
	public List<DetalleProducto> getAllDetalleProducto (){
		return detalleProductoRepository.findAll();
	}
	
	public void delete (DetalleProducto detalleProducto) {
		detalleProductoRepository.delete(detalleProducto);
	}
	
	public Optional<DetalleProducto> findById (Long id) {
		return detalleProductoRepository.findById(id);
	}

}
