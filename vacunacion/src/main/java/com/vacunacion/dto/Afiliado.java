package com.vacunacion.dto;

import java.util.Date;

public class Afiliado {
	private Long idAfiliado;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sexo;
	private Date fechaNacimiento;
	private String curp;
	private String institucionAsegura;
	private String matriculaAsegurado;
	private Direccion direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getInstitucionAsegura() {
		return institucionAsegura;
	}
	public void setInstitucionAsegura(String institucionAsegura) {
		this.institucionAsegura = institucionAsegura;
	}
	public String getMatriculaAsegurado() {
		return matriculaAsegurado;
	}
	public void setMatriculaAsegurado(String matriculaAsegurado) {
		this.matriculaAsegurado = matriculaAsegurado;
	}
	public Long getIdAfiliado() {
		return idAfiliado;
	}
	public void setIdAfiliado(Long idAfiliado) {
		this.idAfiliado = idAfiliado;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
