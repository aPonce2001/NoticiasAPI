package com.humilde.persistencia.jpa;

import com.humilde.persistencia.AutorDAO;
import com.humilde.persistencia.DAOFactory;
import com.humilde.persistencia.NoticiaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public NoticiaDAO getNoticiaDAO() {
		return new JPANoticiaDAO();
	}

	@Override
	public AutorDAO getAutorDAO() {
		return new JPAAutorDAO();
	}

}
