package com.cg.mortgage.loan.service;

import java.util.List;



import com.cg.mortgage.loan.entity.Customer;


public interface CustomerService   {
	
	public  Customer saveCustomer(Customer customer);
		
	public  List<Customer> getAllCustomers(); 
	
}
