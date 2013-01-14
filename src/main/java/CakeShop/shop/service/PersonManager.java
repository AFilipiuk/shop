package CakeShop.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import CakeShop.shop.domain.Person;

@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
		Person newPerson = new Person();

		newPerson.setFirstName(person.getFirstName());
		newPerson.setZipCode(person.getZipCode());
		newPerson.setPin(person.getPin());
		newPerson.setDateOfBirth(person.getDateOfBirth());
		newPerson.setSurName(person.getSurName());
		newPerson.setAddress(person.getAddress());
		newPerson.setSpec(person.getSpec());

		db.add(newPerson);
	}

	// Removes the person with given PIN
	public void deletePerson(Person person) {
		Person personToRemove = null;
		for (Person p : db) {
			if (person.getPin().equals(p.getPin())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}