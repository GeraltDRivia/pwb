package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DetalleProducto")
public class DetalleProducto {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDetalleProducto;
	private Long idProducto;
	private String descripcion;
	private Double totalCreditos;
	private Double totalDebitos;
	private String fecha;
	
	public DetalleProducto() {
		
	}

	public DetalleProducto(Long idDetalleProducto, Long idProducto, String descripcion, Double totalCreditos,
			Double totalDebitos, String fecha) {
		this.idDetalleProducto = idDetalleProducto;
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.totalCreditos = totalCreditos;
		this.totalDebitos = totalDebitos;
		this.fecha = fecha;
	}

	public Long getIdDetalleProducto() {
		return idDetalleProducto;
	}

	public void setIdDetalleProducto(Long idDetalleProducto) {
		this.idDetalleProducto = idDetalleProducto;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(Double totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public Double getTotalDebitos() {
		return totalDebitos;
	}

	public void setTotalDebitos(Double totalDebitos) {
		this.totalDebitos = totalDebitos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	

}
