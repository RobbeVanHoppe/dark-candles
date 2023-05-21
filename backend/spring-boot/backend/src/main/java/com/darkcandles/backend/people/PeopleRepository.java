package com.darkcandles.backend.people;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PeopleRepository extends MongoRepository<Person, String> {

  List<Person> findAllByPersonType(PersonType personType);

  Person findByEmailAndPassword(String username, String password);
}
