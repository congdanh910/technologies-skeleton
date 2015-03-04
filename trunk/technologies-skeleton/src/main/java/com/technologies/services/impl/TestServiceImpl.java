package com.technologies.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technologies.dao.TestDAO;
import com.technologies.model.Test;
import com.technologies.services.TestService;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAO testDAO;

	@Override
	public Test findById(Integer id, boolean lock) {
		return testDAO.findById(id, lock);
	}

	@Override
	public List<Test> findAll() {
		return testDAO.findAll();
	}

	@Override
	public List<Test> findByExample(Test exampleInstance,
			String... excludeProperty) {
		return testDAO.findByExample(exampleInstance, excludeProperty);
	}

	@Override
	public Test makePersistent(Test entity) {
		return testDAO.makePersistent(entity);
	}

	@Override
	public void makeTransient(Test entity) {
		testDAO.makePersistent(entity);
	}

	@Override
	public void flush() {
		testDAO.flush();
	}

	@Override
	public void clear() {
		testDAO.clear();
	}

}
