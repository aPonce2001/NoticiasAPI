package com.humilde.recursos;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.humilde.modelo.Noticia;
import com.humilde.persistencia.DAOFactory;

@Path("/noticias")
public class RecursoNoticia {
		@GET
		@Produces (MediaType.APPLICATION_JSON)
		public List<Noticia> listarNoticia() {
			return DAOFactory.getInstacia().getNoticiaDAO().getAll();
		}
	}