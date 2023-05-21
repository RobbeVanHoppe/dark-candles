package com.darkcandles.backend;

import com.darkcandles.backend.people.*;
import com.darkcandles.backend.products.Candle;
import com.darkcandles.backend.products.ProductRepository;
import com.darkcandles.backend.products.ProductType;

import java.time.LocalDateTime;

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
  CommandLineRunner runner(ProductRepository productRepository) {
    return args -> {
      Candle candle1 = new Candle(
          ProductType.CANDLE,
          "Round candle",
          10,
          10.0,
          LocalDateTime.now(),
          "Red",
          "Vanilla",
          "Round");

      Candle candle2 = new Candle(
          ProductType.CANDLE,
          "Square candle",
          10,
          15.0,
          LocalDateTime.now(),
          "Black",
          "Wood",
          "Square");
//    productRepository.save(candle2);

    };
  }

  // @Bean
  // CommandLineRunner runner(PeopleRepository peopleRepository) {
  //   return args -> {
  //     // insert mockup customers
  //     Customer customer1 = new Customer(
  //         PersonType.CUSTOMER,
  //         "John",
  //         "Doe",
  //         "john@gmail.com",
  //         "temp123",
  //         new Address("Hasselt", "Belgium", "3500", "TesdtStraat", "1"),
  //         "1234567890");
  //     Customer customer2 = new Customer(
  //         PersonType.CUSTOMER,
  //         "Jane",
  //         "Doe",
  //         "Jane@gmail.com",
  //         "temp123",
  //         new Address("Hasselt", "Belgium", "3500", "TesdtStraat", "1"),
  //         "1234567890");

  //     // peopleRepository.save(customer1, customer2);
  //   };
  // }
}
