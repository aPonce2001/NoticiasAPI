package com.humilde.dto;

import java.util.Date;

public class NoticiaDTO {
	private int id;
	private String title;
	private String cuerpo;
	private int idAutor;
	private Date fecha;

	public NoticiaDTO() {
		super();
	}

	public NoticiaDTO(String title, String cuerpo, int idAutor, Date fecha) {
		super();
		this.title = title;
		this.cuerpo = cuerpo;
		this.idAutor = idAutor;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
