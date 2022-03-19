package com.vacunacion.dto;

import java.util.Date;

public class AfiliadoGrupo {
	private Long idAfiliadoGrupo;
	private Afiliado afiliado;
	private GruposVacuna grupoVacuna;
	private Date fechaAfiliacion;
	public Long getIdAfiliadoGrupo() {
		return idAfiliadoGrupo;
	}
	public void setIdAfiliadoGrupo(Long idAfiliadoGrupo) {
		this.idAfiliadoGrupo = idAfiliadoGrupo;
	}
	public Afiliado getAfiliado() {
		return afiliado;
	}
	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}
	public GruposVacuna getGrupoVacuna() {
		return grupoVacuna;
	}
	public void setGrupoVacuna(GruposVacuna grupoVacuna) {
		this.grupoVacuna = grupoVacuna;
	}
	public Date getFechaAfiliacion() {
		return fechaAfiliacion;
	}
	public void setFechaAfiliacion(Date fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}
	
	
}
