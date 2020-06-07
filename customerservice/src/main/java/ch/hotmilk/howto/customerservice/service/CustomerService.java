package ch.hotmilk.howto.customerservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import ch.hotmilk.howto.customerservice.model.Customer;

@Component
public class CustomerService {
	public final List<Customer> customers;
	
	public CustomerService() {
		customers = Arrays.asList(
	            new Customer(1, "Joe", "Bloggs"),
	            new Customer(2, "Jane", "Doe"));
	}

	public List<Customer> getAllCustomers(){
		return customers;
	}

	public Customer getCustomerById(int id) {
		
		return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
	}
}
