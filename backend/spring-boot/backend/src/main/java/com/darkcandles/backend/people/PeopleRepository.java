package com.darkcandles.backend.people;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PeopleRepository extends MongoRepository<Person, String> {

  abstract List<Person> findAllByPersonType(PersonType personType);
}
