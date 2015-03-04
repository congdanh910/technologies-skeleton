package com.technologies.services;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, ID extends Serializable> {
	T findById(ID id, boolean lock);

	List<T> findAll();

	List<T> findByExample(T exampleInstance, String... excludeProperty);

	T makePersistent(T entity);

	void makeTransient(T entity);

	void flush();

	void clear();

}
