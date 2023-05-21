package com.darkcandles.backend.people;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PeopleService {

      private final PeopleRepository peopleRepository;

  public PeopleService(PeopleRepository peopleRepository) {
    this.peopleRepository = peopleRepository;
  }

  public List<Person> getAllPeople() {
    return peopleRepository.findAll();
  }

  public List<Person> getPeopleByType(PersonType personType) {
    return peopleRepository.findAllByPersonType(personType);
  }

  public Person createPerson(Person person) {
    return peopleRepository.save(person);
  }

  public Person login(String email, String password) {
    return peopleRepository.findByEmailAndPassword(email, password);
  }
}
