package com.cg.mortgage.loan.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equity_tb0")
public class Enquiry {

	@Id
	@Column(name = "typeOfMortgage")
	private String typeOfMortgage;

	@Column(name = "customerId")
	private int customer_id;

    @Column(name = "assetvalue")
	private String assetValue;

	@Column(name = "approvaldate")
	private LocalDate appliedDate;

	@Column(name = "loanstatus")
	private String loanStatus;

	@Column(name = "tenure")
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
