package com.technologies.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.technologies.model.MongoTest;

public interface MongoTestRepository extends MongoRepository<MongoTest, String> {
	public MongoTest findByName(String name);
	public MongoTest findByCreateDate(Date createDate);
}
