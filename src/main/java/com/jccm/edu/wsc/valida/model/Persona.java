package com.jccm.edu.wsc.valida.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAS_VERIF")
public class Persona {
	@Id
	@Column(length = 9)
	private String dnie;
	@Column(length = 40)
	private String nombre, apellido1, apellido2, locnac, pronac, padre, madre,
			locres, prores, dirres;
	@Column(length = 22)
	private String nacionalidad;
	@Column(length = 1)
	private String sexo;
	@Column(length = 8)
	private String fecnac, feccad;
	@Column(length = 1)
	private String resul;
	private String mensaje;

	private Date FechaVerificacion;
	@Column(length = 40)
	private String SitemaVerificacion;

	public Persona() {
		super();
	}

	public String getDnie() {
		return dnie;
	}

	public void setDnie(String dnie) {
		this.dnie = dnie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getLocnac() {
		return locnac;
	}

	public void setLocnac(String locnac) {
		this.locnac = locnac;
	}

	public String getPronac() {
		return pronac;
	}

	public void setPronac(String pronac) {
		this.pronac = pronac;
	}

	public String getPadre() {
		return padre;
	}

	public void setPadre(String padre) {
		this.padre = padre;
	}

	public String getMadre() {
		return madre;
	}

	public void setMadre(String madre) {
		this.madre = madre;
	}

	public String getLocres() {
		return locres;
	}

	public void setLocres(String locres) {
		this.locres = locres;
	}

	public String getProres() {
		return prores;
	}

	public void setProres(String prores) {
		this.prores = prores;
	}

	public String getDirres() {
		return dirres;
	}

	public void setDirres(String dirres) {
		this.dirres = dirres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecnac() {
		return fecnac;
	}

	public void setFecnac(String fecnac) {
		this.fecnac = fecnac;
	}

	public String getFeccad() {
		return feccad;
	}

	public void setFeccad(String feccad) {
		this.feccad = feccad;
	}

	public String getResul() {
		return resul;
	}

	public void setResul(String resul) {
		this.resul = resul;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFechaVerificacion() {
		return FechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		FechaVerificacion = fechaVerificacion;
	}

	public String getSitemaVerificacion() {
		return SitemaVerificacion;
	}

	public void setSitemaVerificacion(String sitemaVerificacion) {
		SitemaVerificacion = sitemaVerificacion;
	}

}
