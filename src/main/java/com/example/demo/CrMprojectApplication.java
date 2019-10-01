package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.CustomerController;
import com.example.entity.Customer;
import com.example.services.CustomerService;
import com.example.services.CustomerServiceImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = {CustomerController.class})
public class CrMprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrMprojectApplication.class, args);
	}

}
