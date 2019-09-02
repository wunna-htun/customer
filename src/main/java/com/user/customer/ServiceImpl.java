package com.user.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service

public class ServiceImpl implements CustomerService{

	@Autowired 
	public CustomerRepository repository;
	
	@Override
	public List<Customer> getAllCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Customer getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer postCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save( customer);
	}

	@Override
	public Customer deleteByCustomerId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}


}
