package com.example.proyectofinal.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectofinal.model.Banco;
import com.example.proyectofinal.repository.BancoRepository;

@Service
public class BancoService {
	
	@Autowired
	private BancoRepository bancoRepository;
	
	public Banco create (Banco banco) {
		return bancoRepository.save(banco);
	}
	
	public List<Banco> getAllBanco (){
		return bancoRepository.findAll();
	}
	
	public void delete (Banco banco) {
		bancoRepository.delete(banco);
	}
	
	public Optional<Banco> findById (Long id) {
		return bancoRepository.findById(id);
	}

}
