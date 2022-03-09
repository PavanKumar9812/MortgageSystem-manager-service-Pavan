package com.cg.mortgage.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mortgage.loan.entity.Customer;
import com.cg.mortgage.loan.entity.Enquiry;
import com.cg.mortgage.loan.service.EnquiryService;

@RestController
@RequestMapping("/entity")
public class EnquiryController {
	
	@Autowired
	private EnquiryService enquiryService;
	
	
	
	@GetMapping("/view")
	public List<Enquiry> fetchAllEnquiry(){
	
	 List<Enquiry> enquirys = enquiryService.getAllEnquiry();
	 return enquirys;
	 }
	
		
	@PutMapping("/update")
	public ResponseEntity<Enquiry> modifyEnquiry(@RequestBody Enquiry enquiry) {
	
		Enquiry updatedEnquiry = enquiryService.updateEnquiry(enquiry);
		return new ResponseEntity<>(updatedEnquiry, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Enquiry> addEnquiry(@RequestBody Enquiry enquiry) {
		
		Enquiry newEnquiry = enquiryService.saveEnquiry(enquiry);
		ResponseEntity<Enquiry> responseEntity = new ResponseEntity<>(newEnquiry,HttpStatus.CREATED);
		
		return responseEntity;
	}

}
