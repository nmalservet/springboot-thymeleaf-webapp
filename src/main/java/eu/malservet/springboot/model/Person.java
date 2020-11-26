package eu.malservet.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	public Person() {

	}

	public Person(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}
	@Id
	String id;

	
	String name;

	String firstName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
