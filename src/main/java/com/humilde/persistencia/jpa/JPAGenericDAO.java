package com.humilde.persistencia.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.humilde.persistencia.GenericDAO;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	protected EntityManager em;
	private Class<T> persistentClass;

	public JPAGenericDAO(Class<T> persistentClass) {
		super();
		this.persistentClass = persistentClass;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NoticiasAPI");
		this.em = emf.createEntityManager();
	}

	@Override
	public void create(T entidad) {
		em.getTransaction().begin();
		try {
			em.persist(entidad);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}

	}

	@Override
	public T getByID(ID id) {
		return em.find(this.persistentClass, id);
	}

	@Override
	public List<T> getAll() {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(persistentClass);
		Root<T> root = criteriaQuery.from(persistentClass);
		
		criteriaQuery.select(root);

		TypedQuery<T> typedQuery = em.createQuery(criteriaQuery);
		List<T> resultado = typedQuery.getResultList();

		return resultado;
	}

	@Override
	public void update(T entidad) {
		em.getTransaction().begin();
		try {
			em.merge(entidad);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteById(ID id) {
		em.getTransaction().begin();
		try {
			T entidad = em.find(persistentClass, id);
			em.remove(entidad);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

}
