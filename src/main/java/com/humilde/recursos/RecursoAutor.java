package com.humilde.recursos;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.humilde.modelo.Autor;
import com.humilde.persistencia.DAOFactory;

@Path("/autores")
public class RecursoAutor {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Autor> listarAutores() {
		return DAOFactory.getInstacia().getAutorDAO().getAll();
	}
	
	@Path("/crear")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean crearAutor(Autor autor) {
		try {
			DAOFactory.getInstacia().getAutorDAO().create(autor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean actualizarAutor(Autor autor) {
		try {
			DAOFactory.getInstacia().getAutorDAO().update(autor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/borrar")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public boolean borrarAutorID(@QueryParam("id") Integer id ) {
		try {
			DAOFactory.getInstacia().getAutorDAO().deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/buscarID")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Autor buscarAutorPorID(@QueryParam("id") Integer id) {
		return DAOFactory.getInstacia().getAutorDAO().getByID(id);
	}
	
	
}

