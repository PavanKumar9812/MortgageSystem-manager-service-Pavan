package com.cg.mortgage.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "mortgageloan_application")
public class MortgageLoanApplication {
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="type_of_mortgage")
	private String typeOfMortgage;
	
	@Column(name="tenure")
	private int tenure;
	
	
	@Column(name="loan_amount")
	private int loanAmount;
	
	@Column(name="approval_status") 
    private String approvalStatus;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTypeOfMortgage() {
		return typeOfMortgage;
	}

	public void setTypeOfMortgage(String typeOfMortgage) {
		this.typeOfMortgage = typeOfMortgage;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	
}
