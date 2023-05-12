package com.darkcandles.backend;

import com.darkcandles.backend.people.Address;
import com.darkcandles.backend.people.Customer;
import com.darkcandles.backend.people.PersonRepository;
import com.darkcandles.backend.products.Candle;
import com.darkcandles.backend.products.Product;
import com.darkcandles.backend.products.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(PersonRepository repository) {
    return args -> {
      repository.save(
        new Customer(
          "John",
          "Doe",
          "john@gmail.com",
          "1234567890",
          new Address(
            "Hasselt",
            "Belgie",
            "3500",
            "Kempische Steenweg",
            "1"
          ),
          "0456258469"
        ));
    };
  }
}
