package com.humilde.recursos;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.humilde.modelo.Autor;
import com.humilde.persistencia.DAOFactory;

@Path("/autores")
public class RecursoAutor {
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	public List<Autor> listarAutores() {
		return DAOFactory.getInstacia().getAutorDAO().getAll();
	}
}
