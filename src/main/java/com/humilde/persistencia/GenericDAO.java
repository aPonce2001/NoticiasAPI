package com.humilde.persistencia;

import java.util.List;

public interface GenericDAO<T, ID> {
	
	public void create(T entidad);
	public T getByID(ID id);
	public List<T> getAll();
	public void update(T entidad);
	public void deleteById(ID id);
	
	
}
