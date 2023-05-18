package com.darkcandles.backend.people;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/people")
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPeople() {
      try {
        return new ResponseEntity<>(peopleService.getAllPeople(), HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @GetMapping("/type/{personType}")
    public ResponseEntity<List<Person>> getPeopleByType(@PathVariable PersonType personType) {
      try {
        return new ResponseEntity<>(peopleService.getPeopleByType(personType), HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
      try {
        return new ResponseEntity<>(peopleService.createPerson(person), HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

}
