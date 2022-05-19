package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProducto;
	private Long idBanco;
	private Long idPersona;
	private Long idTipoProducto;
	private Double SaldoDisponible;
	private Double SaldoReserva;
	private Double SaldoFlotante;
	private Double SaldoTotal;
	
	public Producto() {
		
	}

	public Producto(Long idProducto, Long idBanco, Long idPersona, Long idTipoProducto, Double saldoDisponible,
			Double saldoReserva, Double saldoFlotante, Double saldoTotal) {
		this.idProducto = idProducto;
		this.idBanco = idBanco;
		this.idPersona = idPersona;
		this.idTipoProducto = idTipoProducto;
		this.SaldoDisponible = saldoDisponible;
		this.SaldoReserva = saldoReserva;
		this.SaldoFlotante = saldoFlotante;
		this.SaldoTotal = saldoTotal;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Long idBanco) {
		this.idBanco = idBanco;
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

	public Double getSaldoDisponible() {
		return SaldoDisponible;
	}

	public void setSaldoDisponible(Double saldoDisponible) {
		SaldoDisponible = saldoDisponible;
	}

	public Double getSaldoReserva() {
		return SaldoReserva;
	}

	public void setSaldoReserva(Double saldoReserva) {
		SaldoReserva = saldoReserva;
	}

	public Double getSaldoFlotante() {
		return SaldoFlotante;
	}

	public void setSaldoFlotante(Double saldoFlotante) {
		SaldoFlotante = saldoFlotante;
	}

	public Double getSaldoTotal() {
		return SaldoTotal;
	}

	public void setSaldoTotal(Double saldoTotal) {
		SaldoTotal = saldoTotal;
	}
	
	

}
