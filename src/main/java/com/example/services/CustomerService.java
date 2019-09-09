package com.example.services;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {
	
	public List<Customer> listCostumers();
	public Customer addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	
}
