package com.example.services;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Customer;

//Implementation of customer service
public class CustomerServiceImpl implements CustomerService {
	
	// Customer's ArrayList that has all the customers
	private List<Customer> customers = new ArrayList<Customer>();
	

	// function that lists all the customers
	@Override
	public List<Customer> listCostumers() {
		// TODO Auto-generated method stub
		return this.customers;
	}
	
	// function that adds a new customer to the list of customers
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer == null) return false;
		boolean add = this.customers.add(customer);
		return add;
	}

	// function that update a customer in the list of customers
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer == null) return null;
		int index = this.customers.indexOf(customer);
		Customer customerTemp = this.customers.set(index, customer);
		return customerTemp;
	}
	
	//function that 
	@Override
	public boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer == null) return false;
		boolean remove = this.customers.remove(customer);
		return remove;
	}

}
