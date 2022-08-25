package dev.scott.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import dev.scott.data.Customer;

@Service
public class CustomerService {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

	@Cacheable(cacheNames = "customer", key = "#id")
	public Customer getCustomer(final Long id) {

		LOG.info("Returning customer information for customer id {} ", id);
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setFirstName("Test");
		customer.setLastName("User");
		customer.setEmail("contact-us@javadevjournlal.com");
		return customer;
	}

	@Cacheable(cacheNames = "customerList", key = "'customerList'")
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		LOG.info("Returning customer list");
		for (int i = 0; i < 4; i++) {
			Customer customer = new Customer();
			customer.setCustomerId(Long.valueOf(i));
			customer.setFirstName("FirstName" + i);
			customer.setLastName("LastName" + i);
			customer.setEmail("contact-us@javadevjournlal.com" + i);
			customers.add(customer);
		}
		return customers;
	}
}
