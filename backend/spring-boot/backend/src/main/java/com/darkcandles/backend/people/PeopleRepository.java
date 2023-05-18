package com.darkcandles.backend.people;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

  List<Customer> findAllByPersonType(PersonType personType);
}
