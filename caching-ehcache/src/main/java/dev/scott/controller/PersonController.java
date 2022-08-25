package dev.scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.scott.model.Person;
import dev.scott.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;

	@GetMapping("/{name}")
	public Person generatePerson(@PathVariable(value = "name") String value) {
		return service.generatePerson(value);
	}

	@GetMapping("/person/{name}")
	public String getPerson(@PathVariable(value = "name") String name) {
		Person person = new Person("", name, "");

		return service.fetchPerson(person).toString();
	}

	@GetMapping("/evict/{name}")
	public String evictPerson(@PathVariable(value = "name") String name) {
		Person person = new Person("", name, "");

		service.evictPerson(person);
		return person.toString();
	}
}
