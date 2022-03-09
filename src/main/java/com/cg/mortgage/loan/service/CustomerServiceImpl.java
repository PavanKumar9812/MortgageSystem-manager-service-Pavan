package com.cg.mortgage.loan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.mortgage.loan.entity.Customer;
import com.cg.mortgage.loan.repository.customerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private customerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
		
		Customer savedCustomer = customerRepository.save(customer);
		
		return savedCustomer;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customer=customerRepository.findAll();
		return customer;
	}


}
