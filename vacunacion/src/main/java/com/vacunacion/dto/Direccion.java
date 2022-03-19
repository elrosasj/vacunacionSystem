package com.vacunacion.dto;

public class Direccion {
	private Long idDireccion;
	private String municipio;
	private String estado;
	private String pais;
	private String localidad;
	private String codigoPostal;
	private String numExterno;
	private String numInterno;
	private String calle;
	private String referencias;
	public Long getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getNumExterno() {
		return numExterno;
	}
	public void setNumExterno(String numExterno) {
		this.numExterno = numExterno;
	}
	public String getNumInterno() {
		return numInterno;
	}
	public void setNumInterno(String numInterno) {
		this.numInterno = numInterno;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
}
