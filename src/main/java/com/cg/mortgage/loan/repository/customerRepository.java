package com.cg.mortgage.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mortgage.loan.entity.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer,String> {


	
}
