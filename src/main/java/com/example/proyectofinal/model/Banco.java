package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Banco")
public class Banco {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idBanco;
	private String nombre_banco;
	private String direccion_banco;
	
	public Banco() {
		
	}

	public Banco(Long idBanco, String nombre_banco, String direccion_banco) {
		this.idBanco = idBanco;
		this.nombre_banco = nombre_banco;
		this.direccion_banco = direccion_banco;
	}

	public Long getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Long idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre_banco() {
		return nombre_banco;
	}

	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}

	public String getDireccion_banco() {
		return direccion_banco;
	}

	public void setDireccion_banco(String direccion_banco) {
		this.direccion_banco = direccion_banco;
	}


}
