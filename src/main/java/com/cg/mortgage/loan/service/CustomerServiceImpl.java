package com.cg.mortgage.loan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.mortgage.loan.entity.Customer;
import com.cg.mortgage.loan.repository.customerRepository;



	

/****************************************************************************************************************************
 - Method Name      : saveCustomer
 - Input Parameters : customer entity
 - Return type      : Customer
 - Author           : Pavan Kumar Meharwade
 - Creation Date    : 08-03-2022
 - Description      : Saving   the Customer information entered by admin into  the database.
  ****************************************************************************************************************************/ 
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private customerRepository customerRepository;
	
	
	public Customer saveCustomer(Customer customer) {
		
		Customer savedCustomer = customerRepository.save(customer);
		
		return savedCustomer;
	}
	

	/****************************************************************************************************************************
	 - Method Name      : getAllCustomer
	 - Input Parameters : customer entity
	 - Return type      : List
	 - Author           : Pavan Kumar Meharwade
	 - Creation Date    : 08-03-2022
	 - Description      : fetching the Customer information entered by admin into  the database.
	  ****************************************************************************************************************************/ 
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customer=customerRepository.findAll();
		return customer;
	}


}
