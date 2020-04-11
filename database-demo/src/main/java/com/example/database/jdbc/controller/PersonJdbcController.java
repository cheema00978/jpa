package com.example.database.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.bean.Person;
import com.example.database.jdbc.service.PersonJdbcService;

@RestController
@RequestMapping("/jdbc")
public class PersonJdbcController {

	
	@Autowired
	private PersonJdbcService service;
	
	
	@RequestMapping("/getPersons")
	public List<Person> findAll(){
		
		return service.findAll();
		
	}
	@RequestMapping("/findById")
	public Person findById(@RequestParam("id") int id){
		return service.findById(id);
	}
	
	@RequestMapping("/deleteById")
	public int deleteById(@RequestParam("id") int id){
		return service.deleteById(id);
	}
	
	@PostMapping(value="/create",consumes = "application/json")
	public int create(@RequestBody Person person){
		System.out.println(person);
		return service.create(person);
	}
}
