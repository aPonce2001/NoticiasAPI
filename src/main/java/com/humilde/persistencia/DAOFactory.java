package com.humilde.persistencia;

public abstract class DAOFactory {
	
	protected static DAOFactory instacia;

	public static DAOFactory getInstacia() {
		return instacia;
	}
	
	public abstract NoticiaDAO getNoticiaDAO();
	public abstract AutorDAO getAutorDAO();
}
