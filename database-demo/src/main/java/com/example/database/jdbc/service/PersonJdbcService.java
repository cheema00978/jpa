package com.example.database.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.bean.Person;
import com.example.database.jdbc.repo.PersonJdbcDao;

@Service
public class PersonJdbcService {

	
	@Autowired
	private PersonJdbcDao dao;
	
	public List<Person> findAll(){
		return dao.findAll();
	}

	public Person findById(int id){
		return dao.findById(id);
	}
	
	public int deleteById(int id){
		return dao.deleteById(id);
	}

	public int create(Person person) {
		return dao.create(person);
	}
}
