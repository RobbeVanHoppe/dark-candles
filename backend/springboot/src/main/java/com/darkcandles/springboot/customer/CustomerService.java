package com.darkcandles.springboot.customer;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

  private final List<Customer> customerList;

  public CustomerService() {
    this.customerList = new ArrayList<>();

    Customer cust1 = new Customer(1, "Jan", "De Man", "john@gmail.com");
    Customer cust2 = new Customer(2, "Jan", "De Man", "john@gmail.com");
    Customer cust3 = new Customer(3, "Jan", "De Man", "john@gmail.com");
    Customer cust4 = new Customer(4, "Jan", "De Man", "john@gmail.com");

    customerList.addAll(Arrays.asList(cust1, cust2, cust3, cust4));

  }

  public List<Customer> getAllCustomers() {
    return customerList;
  }


  public Optional<Customer> getCustomer(Integer id) {
    Optional<Customer> optional = Optional.empty();
    for (Customer cust : customerList) {
      if (Objects.equals(id, cust.getCustomerID())) {
        optional = Optional.of(cust);
      }
    }
    return optional;
  }
}
