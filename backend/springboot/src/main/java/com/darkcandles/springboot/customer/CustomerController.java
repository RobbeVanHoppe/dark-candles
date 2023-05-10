package com.darkcandles.springboot.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer id) {
        Optional<Customer> cust = customerService.getCustomer(id);

      if (cust.isPresent()) return ResponseEntity.ok(cust.get());
      else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> custList = customerService.getAllCustomers();

        return new ResponseEntity<List<Customer>>(custList, HttpStatus.OK);
    }
}
