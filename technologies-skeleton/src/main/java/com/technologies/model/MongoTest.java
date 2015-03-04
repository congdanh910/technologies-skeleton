package com.technologies.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="test_test")
public class MongoTest implements Serializable {
	private static final long serialVersionUID = -7205069393441326248L;
	@Id
	private String id;
	private String name;
	private int age;
	private Date createDate;

	public MongoTest() {
	}

	public MongoTest(String name, int age, Date createDate) {
		this.name = name;
		this.age = age;
		this.createDate = createDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
