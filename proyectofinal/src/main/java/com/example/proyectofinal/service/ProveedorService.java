package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Proveedor;
import com.example.proyectofinal.repository.ProveedorRepository;

@Service
public class ProveedorService {
	
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	public Proveedor create (Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}
	
	public List<Proveedor> getAllProveedor (){
		return proveedorRepository.findAll();
	}
	
	public void delete (Proveedor proveedor) {
		proveedorRepository.delete(proveedor);
	}
	
	public Optional<Proveedor> findById (Long id) {
		return proveedorRepository.findById(id);
	}

}
