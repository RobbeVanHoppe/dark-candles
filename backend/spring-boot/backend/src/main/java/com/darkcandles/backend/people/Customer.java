package com.darkcandles.backend.people;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends Person{
  public Customer(PersonType personType, String firstName, String lastName, String email, String password, Address address, String phone) {
    super(personType, firstName, lastName, email, password, address, phone);
    this.setPersonType(personType);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setEmail(email);
    this.setPassword(password);
    this.setAddress(address);
    this.setPhone(phone);
  }


}
