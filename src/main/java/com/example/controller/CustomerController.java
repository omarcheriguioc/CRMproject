package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.services.CustomerService;
import com.example.services.CustomerServiceImpl;

// Customer's rest controller that lists, adds, updates, and removes customers from the customer's list
@RestController
@ComponentScan(basePackageClasses = {CustomerServiceImpl.class,CustomerService.class})
public class CustomerController {
	
	// customer service instance
	private CustomerService customerService;

	// Constructor without parameters 
	public CustomerController() throws ParseException {
		super();
		this.customerService = new CustomerServiceImpl();
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		this.customerService.addCustomer(new Customer("test", "test", new Date()));
	}
	
	
	// Function that lists all customers from the list 
	@RequestMapping(value="/customers", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Customer> listAllCustomers() {
		return this.customerService.listCostumers();
	}
	
	// Function that adds new customer to the list
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/customers")
	public boolean addNewCustomer(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	
}
