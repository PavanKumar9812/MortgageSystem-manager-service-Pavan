package com.cg.mortgage.loan.model;

import java.time.LocalDate;

public class Enquiry1 {
	
	private String typeOfMortgage;
	private int customer_id;
	private String assetValue;
	private LocalDate appliedDate;
	private String loanStatus;
	private int tenure;
	
	public String getTypeOfMortgage() {
		return typeOfMortgage;
	}
	public void setTypeOfMortgage(String typeOfMortgage) {
		this.typeOfMortgage = typeOfMortgage;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getAssetValue() {
		return assetValue;
	}
	public void setAssetValue(String assetValue) {
		this.assetValue = assetValue;
	}
	public LocalDate getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

}
