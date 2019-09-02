package com.user.customer;

import java.util.List;


public interface CustomerService  {

	public List<Customer> getAllCustomer( Customer customer );
	public Customer getById(long id);
	public Customer postCustomer(Customer customer);
	public Customer deleteByCustomerId(long id);
	public List<Customer> deleteAll();
	public Customer findByAge();//error
	public Customer updateCustomer(Customer customer);
	
	
	
	
	
	
}
