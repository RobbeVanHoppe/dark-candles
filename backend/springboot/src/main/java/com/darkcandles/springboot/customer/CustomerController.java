package com.darkcandles.springboot.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/user")
    public Customer getCustomer(@RequestParam Integer id) {
        Optional<Customer> cust = customerService.getCustomer(id);
      return (Customer) cust.orElse(null);
    }
}
