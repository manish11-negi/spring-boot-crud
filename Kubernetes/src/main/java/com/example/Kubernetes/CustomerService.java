package com.example.Kubernetes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
@Autowired
CustomerRepository customerRepository;
	
	public List<Customer> getCustomer() {
		return customerRepository.findAll();
		}
	
	public Customer createCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		  
		return customerRepository.save(customer);
		 
	}
	
	public String deleteCustomer(int id) {
		customerRepository.deleteById(id);
		return "Record Deleted with Id->"+id;
	}

}
