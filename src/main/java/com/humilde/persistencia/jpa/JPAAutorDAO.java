package com.humilde.persistencia.jpa;

import com.humilde.modelo.Autor;
import com.humilde.persistencia.AutorDAO;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO {

	public JPAAutorDAO() {
		super(Autor.class);
	}
}
