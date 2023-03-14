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
import com.humilde.modelo.Noticia;
import com.humilde.persistencia.DAOFactory;

@Path("/noticias")
public class RecursoNoticia {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> listarNoticia() {
		return DAOFactory.getInstacia().getNoticiaDAO().getAll();
	}

	@Path("/crear")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean crearNoticia(Noticia noticia) {
		try {
			DAOFactory.getInstacia().getNoticiaDAO().create(noticia);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean actualizarNoticia(Noticia noticia) {
		try {
			DAOFactory.getInstacia().getNoticiaDAO().update(noticia);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/borrar")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public boolean borrarNoticiaID(@QueryParam("id") Integer id ) {
		try {
			DAOFactory.getInstacia().getNoticiaDAO().deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Path("/buscarId")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Noticia buscarNoticiaPorID(@QueryParam("id") Integer id) {
		return DAOFactory.getInstacia().getNoticiaDAO().getByID(id);
	}

	@Path("/buscarPorAutorId")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> buscarNoticiaPorIDAutor(@QueryParam("idAutor") Integer id) {
		return DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByAutorID(id);
	}
	
	@Path("/buscarPorYear")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> buscarNoticiaPorYear(@QueryParam("year") int year) {
		return DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByYear(year);
	}
	
	@Path("/buscarPorTitulo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> buscarNoticiaPorTitulo(@QueryParam("titulo") String titulo) {
		return DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByTitleContain(titulo);
	}
	
}