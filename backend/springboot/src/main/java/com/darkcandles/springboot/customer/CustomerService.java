package com.darkcandles.springboot.customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

  private List<Customer> customerList;

  public CustomerService() {
    customerList = new ArrayList<>();

    Customer cust1 = new Customer(1, "Jan", "De Man", "john@gmail.com");
    Customer cust2 = new Customer(2, "Jan", "De Man", "john@gmail.com");
    Customer cust3 = new Customer(3, "Jan", "De Man", "john@gmail.com");
    Customer cust4 = new Customer(4, "Jan", "De Man", "john@gmail.com");

    customerList.addAll(Arrays.asList(cust1, cust2, cust3, cust4));

  }

  public Optional<Customer> getCustomer(Integer id) {
    Optional<Customer> optional = Optional.empty();
    for (Customer cust : customerList) {
      if (id == cust.getCustomerID()) {
        optional = Optional.of(cust);
      }
    }
    return optional;
  }
}
