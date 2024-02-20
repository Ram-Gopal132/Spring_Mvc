package com.app.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	
	@NotNull(message = "Is Required")
	@Size(min=1,message = "is Required")
	private String lastName;
	
	
	@NotNull(message = "Is Required")
	@Min(value =1, message = "Must be greater than or equal to 1")
	@Max(value = 10,message = "Must be less than or equal to 10")
	private int freePasses;
	
	
	@Pattern(regexp ="^[0-9]{6}", message = "Only digits are allowed")
	private String pincode;
	
	
	@NotNull(message = "Is Required")
	@Email
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName,
			String lastName,int freePasses,String pincode,String email) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.freePasses = freePasses;
		this.pincode = pincode;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
