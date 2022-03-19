package com.vacunacion.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.vacunacion.validation.CurpRegex;

public class Afiliado {
	private Long idAfiliado;

	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellidoPaterno;
	@NotEmpty
	private String apellidoMaterno;
	@NotEmpty
	private String sexo;
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date fechaNacimiento;

	@NotEmpty
	@CurpRegex(message = "El campo Curp tiene un formato invalido")
	private String curp;
	private String matriculaAsegurado;
	private String codigoPostal;
	
	@NotEmpty
	@Email
	private String email;

	@Size(min = 10, max = 10)
	private String telefonoFijo;

	@Size(min = 10, max = 10)
	private String telefonoCelular;

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

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

}
