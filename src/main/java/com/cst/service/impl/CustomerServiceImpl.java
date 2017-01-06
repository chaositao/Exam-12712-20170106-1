package com.cst.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cst.dto.Customer;
import com.cst.mapper.CustomerMapper;
import com.cst.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer login(Customer customer) {
		return customerMapper.queryByFirstName(customer);
	}

}
