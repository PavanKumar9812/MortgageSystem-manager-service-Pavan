package com.cg.mortgage.loan.util;

import com.cg.mortgage.loan.entity.Enquiry;
import com.cg.mortgage.loan.model.Enquiry1;

public class EntityModelUtil {
	
public static Enquiry postModelToEntity(Enquiry1 enquiry1) {
		
	Enquiry enquiry = new Enquiry();
	enquiry.setTypeOfMortgage(enquiry1.getTypeOfMortgage());
	enquiry.setCustomer_id(enquiry1.getCustomer_id());
	enquiry.setAssetValue(enquiry1.getAssetValue());
	enquiry.setAppliedDate(enquiry1.getAppliedDate());
	enquiry.setLoanStatus(enquiry1.getLoanStatus());
	enquiry.setTenure(enquiry1.getTenure());
		
		return enquiry;
		
	}

}
