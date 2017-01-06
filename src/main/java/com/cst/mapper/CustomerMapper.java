package com.cst.mapper;

import com.cst.dto.Customer;

public interface CustomerMapper {
	public Customer queryByFirstName(Customer customer);
}
