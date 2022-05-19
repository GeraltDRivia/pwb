package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Servicio")
public class Servicio {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idServicio;
	private Long idProveedor;
	private Long idPersona;
	private Long idTipoProducto;
	private Double Total_servicio;
	
	public Servicio() {
		
	}

	public Servicio(Long idServicio, Long idProveedor, Long idPersona, Long idTipoProducto, Double total_servicio) {
		this.idServicio = idServicio;
		this.idProveedor = idProveedor;
		this.idPersona = idPersona;
		this.idTipoProducto = idTipoProducto;
		this.Total_servicio = total_servicio;
	}

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public Double getTotal_servicio() {
		return Total_servicio;
	}

	public void setTotal_servicio(Double total_servicio) {
		Total_servicio = total_servicio;
	}

}
