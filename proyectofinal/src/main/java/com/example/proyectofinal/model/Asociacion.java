package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Asociacion")
public class Asociacion {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAsociacion;
	private Long idPersona;
	private Long idProducto;
	private String desc_asociacion;
	
	public Asociacion() {
		
	}

	public Asociacion(Long idAsociacion, Long idPersona, Long idProducto, String desc_asociacion) {
		super();
		this.idAsociacion = idAsociacion;
		this.idPersona = idPersona;
		this.idProducto = idProducto;
		this.desc_asociacion = desc_asociacion;
	}

	public Long getIdAsociacion() {
		return idAsociacion;
	}

	public void setIdAsociacion(Long idAsociacion) {
		this.idAsociacion = idAsociacion;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDesc_asociacion() {
		return desc_asociacion;
	}

	public void setDesc_asociacion(String desc_asociacion) {
		this.desc_asociacion = desc_asociacion;
	}


}
