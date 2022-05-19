package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoProducto")
public class TipoProducto {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTipoProducto;
	private String descr_producto;
	private String moneda_producto;
	
	public TipoProducto() {
		
	}

	public TipoProducto(Long idTipoProducto, String descr_producto, String moneda_producto) {
		this.idTipoProducto = idTipoProducto;
		this.descr_producto = descr_producto;
		this.moneda_producto = moneda_producto;
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getDescr_producto() {
		return descr_producto;
	}

	public void setDescr_producto(String descr_producto) {
		this.descr_producto = descr_producto;
	}

	public String getMoneda_producto() {
		return moneda_producto;
	}

	public void setMoneda_producto(String moneda_producto) {
		this.moneda_producto = moneda_producto;
	}


}
