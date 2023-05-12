package com.darkcandles.backend.people;

public class Customer extends Person{
  public Customer(String firstName, String lastName, String email, String password, Address address, String phone) {
    super(firstName, lastName, email, password, address, phone);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setEmail(email);
    this.setPassword(password);
    this.setAddress(address);
    this.setPhone(phone);
  }


}
