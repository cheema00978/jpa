package com.example.database.jdbc.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.database.bean.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Person> findAll(){
		System.out.println("In JDBC class");
		return jdbcTemplate.query("Select * from Person",new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id){
		System.out.println("In JDBC class");
		return jdbcTemplate.queryForObject("Select * from Person where person_id=?",new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	
	public int deleteById(int id){
		System.out.println("In JDBC class");
		return jdbcTemplate.update("delete from Person where person_id=?",new Object[] {id});
	}

	public int create(Person person) {
		
		return jdbcTemplate.update("insert into person(first_name,last_name,email_id,creation_date) values (?,?,?,?)",new Object[] {person.getFirstName(),person.getLastName()
				,person.getEmailId(),person.getCreationDate()});
	}
	
}
