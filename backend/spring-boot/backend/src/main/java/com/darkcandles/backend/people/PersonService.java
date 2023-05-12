package com.darkcandles.backend.people;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonService {
  private final PersonRepository personRepository;

}
