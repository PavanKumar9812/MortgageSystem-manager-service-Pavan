package com.cg.mortgage.loan.service;

import java.util.List;

import com.cg.mortgage.loan.entity.Enquiry;


public interface EnquiryService {
	
	
	public List<Enquiry> getAllEnquiry();

	public Enquiry saveEnquiry(Enquiry enquiry);
	public Enquiry updateEnquiry(Enquiry enquiry);

}
