package com.example.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectofinal.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
