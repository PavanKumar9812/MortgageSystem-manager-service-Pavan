package com.cg.mortgage.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_tb0")
public class Customer {
	
	@Id
	@Column(name = "customerid")
	private int customerId;
	
	@Column(name ="firstname")
	private String firstName;
	
	@Column(name ="lastname")
	private String lastName;
	
	@Column(name = "loanammount")
	private int loanAmmount;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="gender")
	private String gender;
	
	@Column(name ="phone_no")
	private long phone_no;

	@Column(name ="adhar_no")
	private long adhar_no;
	
	@Column(name = "typeofmortgage")
	private String typeOfMortgage;

	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastame() {
		return lastName;
	}
	public void setLastame(String lastame) {
		this.lastName = lastame;
	}
	
	public int getLoanAmmount() {
		return loanAmmount;
	}

	public void setLoanAmmount(int loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	public long getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(long adhar_no) {
		this.adhar_no = adhar_no;
	}

	
	public String getTypeOfMortgage() {
		return typeOfMortgage;
	}

	public void setTypeOfMortgage(String typeOfMortgage) {
		this.typeOfMortgage = typeOfMortgage;
	}
	
}