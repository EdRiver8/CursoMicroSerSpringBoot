package com.paymentchain.customer.controller;

import com.paymentchain.customer.entities.Customer;
import com.paymentchain.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

//    @Autowired
//    CustomerRepository customerRepository;

    private final CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Customer> findAll(@RequestBody Customer customer){
        return ResponseEntity.ok(customerRepository.save(customer));
    }

}
