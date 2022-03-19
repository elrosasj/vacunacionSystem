package com.vacunacion.dto;

public class GruposVacuna {
	private Long idGrupoVacuna;
	private String nombre;
	private String descripcion;
	private String rangoEdad;
	
	public Long getIdGrupoVacuna() {
		return idGrupoVacuna;
	}
	public void setIdGrupoVacuna(Long idGrupoVacuna) {
		this.idGrupoVacuna = idGrupoVacuna;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRangoEdad() {
		return rangoEdad;
	}
	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}
	
	
}
