package com.darkcandles.springboot.customer;

public class Customer {

  private Integer CustomerID;
  private String FirstName;
  private String Lastname;
  private String Email;

  public Customer(int id, String firstName, String lastName, String email) {
    this.CustomerID = id;
    this.FirstName = firstName;
    this.Lastname = lastName;
    this.Email = email;
  }

  public Integer getCustomerID() {
    return CustomerID;
  }

  public void setCustomerID(Integer customerID) {
    CustomerID = customerID;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastname() {
    return Lastname;
  }

  public void setLastname(String lastname) {
    Lastname = lastname;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }
}
