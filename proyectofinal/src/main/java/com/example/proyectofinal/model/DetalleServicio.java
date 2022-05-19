package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DetalleServicio")
public class DetalleServicio {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDetalleServicio;
	private Long idServicio;
	private String descripcion;
	private Double TotalCreditos;
	private String fecha_dat_servicio;
	
	public DetalleServicio() {
		
	}

	public DetalleServicio(Long idDetalleServicio, Long idServicio, String descripcion, Double totalCreditos,
			String fecha_dat_servicio) {
		this.idDetalleServicio = idDetalleServicio;
		this.idServicio = idServicio;
		this.descripcion = descripcion;
		this.TotalCreditos = totalCreditos;
		this.fecha_dat_servicio = fecha_dat_servicio;
	}

	public Long getIdDetalleServicio() {
		return idDetalleServicio;
	}

	public void setIdDetalleServicio(Long idDetalleServicio) {
		this.idDetalleServicio = idDetalleServicio;
	}

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getTotalCreditos() {
		return TotalCreditos;
	}

	public void setTotalCreditos(Double totalCreditos) {
		TotalCreditos = totalCreditos;
	}

	public String getFecha_dat_servicio() {
		return fecha_dat_servicio;
	}

	public void setFecha_dat_servicio(String fecha_dat_servicio) {
		this.fecha_dat_servicio = fecha_dat_servicio;
	}

}
