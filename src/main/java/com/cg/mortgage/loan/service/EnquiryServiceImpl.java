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
	
	/****************************************************************************************************************************
	 - Method Name      : getAllEnquiry
	 - Input Parameters : Enquiry entity
	 - Return type      : List
	 - Author           : Pavan Kumar Meharwade
	 - Creation Date    : 08-03-2022
	 - Description      : fetching the Enquiry information entered by admin into  the database.
	  ****************************************************************************************************************************/ 
	
	
	@Override
	public List<Enquiry> getAllEnquiry(){
		
	List<Enquiry> enquiry =enquiryRepository.findAll();
		
	return enquiry;
	}
	

/****************************************************************************************************************************
 - Method Name      : saveEnquiry
 - Input Parameters : Enquiry entity
 - Return type      : Enquiry
 - Author           : Pavan Kumar Meharwade
 - Creation Date    : 08-03-2022
 - Description      : Saving the Enquiry information entered by admin into  the database.
  ****************************************************************************************************************************/ 

	@Override
	public Enquiry saveEnquiry(Enquiry enquiry) {
		Enquiry saveEnquiry = enquiryRepository.save(enquiry);
		return saveEnquiry;
	}

	
	/****************************************************************************************************************************
	 - Method Name      : updateEnquiry
	 - Input Parameters : Enquiry entity
	 - Return type      : Enquiry
	 - Author           : Pavan Kumar Meharwade
	 - Creation Date    : 08-03-2022
	 - Description      : Updating the Enquiry information entered by admin into  the database.
	  ****************************************************************************************************************************/ 
	
	
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
