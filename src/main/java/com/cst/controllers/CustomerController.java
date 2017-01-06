package com.cst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cst.dto.Customer;
import com.cst.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("")
	public String toLogin() {
		return "login.html";
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam(name = "firstName", required = false, defaultValue = "") String firstName) {
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		Customer c = customerService.login(customer);
		if (c == null) {
			return "false";
		} else {
			return "true";
		}
	}
}
