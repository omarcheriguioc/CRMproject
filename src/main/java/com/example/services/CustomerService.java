package com.example.services;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {
	
	public List<Customer> listCostumers();
	public boolean addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	
}
