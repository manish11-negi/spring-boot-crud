package com.example.Kubernetes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/checkapi")
	public String checkAPI() {
		return "Hello API";
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		
		return customerService.getCustomer();
		
	}
	@GetMapping("/customer/{name}")
	public List<Customer> getCustomerbyName(@PathVariable String name) {
		System.out.println("Name->"+name);
		return customerService.getCustomerByNeme(name);
		
	}
	
	@GetMapping("/customer/{name}/{contact}")
	public List<Customer> getCustomerbyNameAndContact(@PathVariable String name,@PathVariable String contact) {
		System.out.println("Name->"+name+"  "+contact);
		return customerService.getCustomerByNeme(name,contact);
		
	}
	
	@PostMapping("/customer")
	public Customer createCustomer(@ RequestBody Customer customer) {
		
		return customerService.createCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@ RequestBody Customer customer) {
		
		return customerService.updateCustomer(customer);
		
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);
		
	}

}
