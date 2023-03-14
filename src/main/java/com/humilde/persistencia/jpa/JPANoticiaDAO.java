package com.humilde.persistencia.jpa;

import java.util.List;

import javax.persistence.Query;

import com.humilde.modelo.Noticia;
import com.humilde.persistencia.NoticiaDAO;

public class JPANoticiaDAO extends JPAGenericDAO<Noticia, Integer> implements NoticiaDAO{

	public JPANoticiaDAO() {
		super(Noticia.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Noticia> getNoticiasByAutorID(Integer id) {
		String JPQL = "select n from Noticia n where "
				+ "n.autor.id = :id";
		Query query = em.createQuery(JPQL);
		query.setParameter("id", id);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Noticia> getNoticiasByYear(int year) {
		String JPQL = "select n from Noticia n where "
				+ "EXTRACT(YEAR from n.fecha) = :anio";
		Query query = em.createQuery(JPQL);
		query.setParameter("anio", year);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Noticia> getNoticiasByTitleContain(String title) {
		String JPQL = "select n from Noticia n where "
				+ "LOWER(n.title) LIKE LOWER(:content) ";
		Query query = em.createQuery(JPQL);
		query.setParameter("content", '%'+title+'%');
		return query.getResultList();
	}

}
