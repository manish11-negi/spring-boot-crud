package com.example.Kubernetes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByName(String name);

	List<Customer> findByNameAndContact(String name, String contact);

}

