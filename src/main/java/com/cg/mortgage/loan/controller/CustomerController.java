package com.cg.mortgage.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mortgage.loan.entity.Customer;
import com.cg.mortgage.loan.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		
		Customer newCustomer = customerService.saveCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(newCustomer,HttpStatus.CREATED);
		
		return responseEntity;
	}
	
	@GetMapping("/view")
	public List<Customer> fetchAllCustomers(){
	
	 List<Customer> customers = customerService.getAllCustomers();
	 
	 return customers;
	 
	}
	
}
