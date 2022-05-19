package com.example.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persona")
public class Persona {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPersona;
	private String Documento_persona;
	private String correo;
	private String clave;
	private String nombres_personas;
	private String apellidos_persona;
	private String fecha_nacimiento_persona;
	private String telefono_persona;
	private String direccion_persona;
	private String fechacrea_persona;
	
	public Persona() {
		
	}

	public Persona(Long idPersona, String documento_persona, String correo, String clave, String nombres_personas,
			String apellidos_persona, String fecha_nacimiento_persona, String telefono_persona,
			String direccion_persona, String fechaCrea_persona) {
		this.idPersona = idPersona;
		this.Documento_persona = documento_persona;
		this.correo = correo;
		this.clave = clave;
		this.nombres_personas = nombres_personas;
		this.apellidos_persona = apellidos_persona;
		this.fecha_nacimiento_persona = fecha_nacimiento_persona;
		this.telefono_persona = telefono_persona;
		this.direccion_persona = direccion_persona;
		this.fechacrea_persona = fechaCrea_persona;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getDocumento_persona() {
		return Documento_persona;
	}

	public void setDocumento_persona(String documento_persona) {
		Documento_persona = documento_persona;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombres_personas() {
		return nombres_personas;
	}

	public void setNombres_personas(String nombres_personas) {
		this.nombres_personas = nombres_personas;
	}

	public String getApellidos_persona() {
		return apellidos_persona;
	}

	public void setApellidos_persona(String apellidos_persona) {
		this.apellidos_persona = apellidos_persona;
	}

	public String getFecha_nacimiento_persona() {
		return fecha_nacimiento_persona;
	}

	public void setFecha_nacimiento_persona(String fecha_nacimiento_persona) {
		this.fecha_nacimiento_persona = fecha_nacimiento_persona;
	}

	public String getTelefono_persona() {
		return telefono_persona;
	}

	public void setTelefono_persona(String telefono_persona) {
		this.telefono_persona = telefono_persona;
	}

	public String getDireccion_persona() {
		return direccion_persona;
	}

	public void setDireccion_persona(String direccion_persona) {
		this.direccion_persona = direccion_persona;
	}

	public String getFechaCrea_persona() {
		return fechacrea_persona;
	}

	public void setFechaCrea_persona(String fechaCrea_persona) {
		this.fechacrea_persona = fechaCrea_persona;
	}
	


}
