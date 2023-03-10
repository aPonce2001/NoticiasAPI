package com.humilde.persistencia;

import java.util.List;

import com.humilde.modelo.Noticia;

public interface NoticiaDAO extends GenericDAO<Noticia, Integer>{
	
	public List<Noticia> getNoticiasByAutorID(Integer id);
	public List<Noticia> getNoticiasByYear(int year);
	public List<Noticia> getNoticiasByTitleContain(String title);
}
