package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Khaledi");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Rachid");
		p.setLastName("Rachidi");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(24);
		p.setFirstName("Basma");
		p.setLastName("Alaoui");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("Adil");
		p.setLastName("Adili");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("webhook");
		p.setLastName("testJenjinsJob");
		persons.add(p);

		p = new Person();
		p.setId("6");
		p.setAge(22);
		p.setFirstName("webhook");
		p.setLastName("testJenjinsJob");
		persons.add(p);
		p = new Person();
		p.setId("7");
		p.setAge(22);
		p.setFirstName("webhook");
		p.setLastName("testJenjinsJob");
		persons.add(p);
		p = new Person();
		p.setId("8");
		p.setAge(22);
		p.setFirstName("webhookkk");
		p.setLastName("testJenjinsJob");
		persons.add(p);

		
		p = new Person();
		p.setId("9");
		p.setAge(32);
		p.setFirstName("webhookkk");
		p.setLastName("testJenjinsJobb");
		persons.add(p);
		
		p = new Person();
		p.setId("10");
		p.setAge(32);
		p.setFirstName("webhookkk");
		p.setLastName("testJenjinsJobb");
		persons.add(p);

		p = new Person();
		p.setId("11");
		p.setAge(23);
		p.setFirstName("Ali");
		p.setLastName("Alaoui");
		persons.add(p);
		p = new Person();
		p.setId("12");
		p.setAge(23);
		p.setFirstName("Aliii");
		p.setLastName("Alaoui");
		persons.add(p);
		
		p = new Person();
		p.setId("13");
		p.setAge(43);
		p.setFirstName("Ali");
		p.setLastName("Ahmadi");
		persons.add(p);
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

