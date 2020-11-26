package eu.malservet.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.malservet.springboot.model.Person;
import eu.malservet.springboot.repository.PersonRepository;

/**
 * class to manipulate messages. Provide commun functionalities and specifics
 * features.
 * 
 * @author nm27
 *
 */
@Component
public class PersonService {

	@Autowired
	private PersonRepository repository;

	/**
	 * retrieve all messages
	 */
	public List<Person> findAll() {
		return repository.findAll();
	}

}
