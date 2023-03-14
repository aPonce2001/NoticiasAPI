package com.humilde.persistencia;

import com.humilde.persistencia.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory instacia = new JPADAOFactory();

	public static DAOFactory getInstacia() {
		return instacia;
	}
	
	public abstract NoticiaDAO getNoticiaDAO();
	public abstract AutorDAO getAutorDAO();
}
