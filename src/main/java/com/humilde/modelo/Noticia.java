package com.humilde.modelo;

import java.time.LocalDate;

public class Noticia {

	private Integer id;
	private String cuerpo;
	private Autor autor;
	private LocalDate fecha;

	public Noticia() {

	}

	public Noticia(int id, String cuerpo, Autor autor, LocalDate fecha) {
		super();
		this.id = id;
		this.cuerpo = cuerpo;
		this.autor = autor;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		int hash = 0;
        hash += (this.id != null ? this.id.hashCode() : 0);
        return hash;
		
	}

	@Override
	public boolean equals(Object object) {
		
		// TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noticia)) {
            return false;
        }
        Noticia other = (Noticia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
}
