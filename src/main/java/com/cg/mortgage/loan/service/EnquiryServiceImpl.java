package com.cg.mortgage.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mortgage.loan.entity.Enquiry;
import com.cg.mortgage.loan.exception.ResourceNotFoundException;
import com.cg.mortgage.loan.repository.enquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService
{
	
	@Autowired
	private enquiryRepository enquiryRepository;
	
	
	@Override
	public List<Enquiry> getAllEnquiry(){
		
	List<Enquiry> enquiry =enquiryRepository.findAll();
		
	return enquiry;
	}
	

	@Override
	public Enquiry saveEnquiry(Enquiry enquiry) {
		Enquiry saveEnquiry = enquiryRepository.save(enquiry);
		return saveEnquiry;
	}
	
	@Override
	public Enquiry updateEnquiry( Enquiry enquiry) {
		 Optional<Enquiry> optionalEnquiry =enquiryRepository.findById(enquiry.getCustomer_id());
			
			if(optionalEnquiry.isEmpty()) {
				
				throw new ResourceNotFoundException("Sorry! Customer not found with id" +enquiry.getCustomer_id());
				
			}
			
			Enquiry updatedenquiry = enquiryRepository.save(enquiry);
			return updatedenquiry;
		}
	}
