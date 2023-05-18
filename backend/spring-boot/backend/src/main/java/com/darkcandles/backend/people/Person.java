package com.darkcandles.backend.people;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public abstract class Person {
  @Id
  private String id;
  private PersonType personType;
  private String firstName;
  private String lastName;
  @Indexed(unique = true)
  private String email;
  private String password;
  private Address address;
  private String phone;

  public Person(PersonType personType, String firstName, String lastName, String email, String password, Address address, String phone) {
    this.personType = personType;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.address = address;
    this.phone = phone;
  }

}
