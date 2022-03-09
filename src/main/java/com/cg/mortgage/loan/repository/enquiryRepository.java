package com.cg.mortgage.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mortgage.loan.entity.Enquiry;

@Repository
public interface enquiryRepository extends JpaRepository<Enquiry,Integer> {



}
