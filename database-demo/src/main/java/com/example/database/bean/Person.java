package com.example.database.bean;

import java.util.Date;

//import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

//@Entity
//@Table(name = "person")
public class Person {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "person_id")
	private int personId;
	//@Column(name = "first_name",nullable = false)
	private String firstName;
	
	//@Column(name = "last_name",nullable = false)
	private String lastName;
	
	//@Column(name = "email_Id",unique = true)
	private String emailId;
	
	//@Column(name = "creation_Date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date creationDate;

	Person(){}
	
	public Person(String firstName, String lastName, String emailId,Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.creationDate=creationDate;
	}


	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", creationDate=" + creationDate + "]";
	}
	
}

