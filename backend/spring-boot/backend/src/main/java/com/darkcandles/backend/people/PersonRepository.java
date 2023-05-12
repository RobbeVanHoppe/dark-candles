package com.darkcandles.backend.people;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
  Person findPersonByEmail(String email);
}
