package com.example.entity;

import java.util.Date;

public class Customer {
	private String fName;
	private String lName;
	private Date dateNaissance;
	
	public Customer() {
		
	}
	
	public Customer(String fName, String lName, Date dateNaissance) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dateNaissance = dateNaissance;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
