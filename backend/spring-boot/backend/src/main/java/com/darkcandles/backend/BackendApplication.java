package com.darkcandles.backend;

import com.darkcandles.backend.people.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }
  @Bean
  CommandLineRunner runner(PeopleRepository peopleRepository) {
    return args -> {
      // insert mockup customers
      Customer customer1 = new Customer(
        PersonType.CUSTOMER,
        "John",
        "Doe",
        "john@gmail.com",
        "temp123",
        new Address("Hasselt", "Belgium", "3500", "TesdtStraat", "1"),
        "1234567890"
      );
      Customer customer2 = new Customer(
        PersonType.CUSTOMER,
        "Jane",
        "Doe",
        "Jane@gmail.com",
        "temp123",
        new Address("Hasselt", "Belgium", "3500", "TesdtStraat", "1"),
        "1234567890"
      );
      peopleRepository.save(customer2);
    };
  }
}
