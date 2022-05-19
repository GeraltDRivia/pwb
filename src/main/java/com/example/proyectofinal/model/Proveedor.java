package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Proveedor")
public class Proveedor {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProveedor;
	private String nombre_prov;
	private String descripcion_prov;
	
	public Proveedor() {
		
	}

	public Proveedor(Long idProveedor, String nombre_prov, String descripcion_prov) {
		this.idProveedor = idProveedor;
		this.nombre_prov = nombre_prov;
		this.descripcion_prov = descripcion_prov;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre_prov() {
		return nombre_prov;
	}

	public void setNombre_prov(String nombre_prov) {
		this.nombre_prov = nombre_prov;
	}

	public String getDescripcion_prov() {
		return descripcion_prov;
	}

	public void setDescripcion_prov(String descripcion_prov) {
		this.descripcion_prov = descripcion_prov;
	}


}
