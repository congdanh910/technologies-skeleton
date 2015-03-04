package com.technologies.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technologies.dao.TestDAO;
import com.technologies.model.Test;

@Repository("testDAO")
public class TestImpl extends GenericDAOImpl<Test, Integer> implements TestDAO{

	@Autowired
	public TestImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
