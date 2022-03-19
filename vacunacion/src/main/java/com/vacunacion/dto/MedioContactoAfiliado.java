package com.vacunacion.dto;

public class MedioContactoAfiliado {
	private Long idMedioContactoAfiliado;
	private String medio;
	private String valor;
	private String prioridad;
	private Afiliado afiliado;
	public Long getIdMedioContactoAfiliado() {
		return idMedioContactoAfiliado;
	}
	public void setIdMedioContactoAfiliado(Long idMedioContactoAfiliado) {
		this.idMedioContactoAfiliado = idMedioContactoAfiliado;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public Afiliado getAfiliado() {
		return afiliado;
	}
	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}
	
	
}
