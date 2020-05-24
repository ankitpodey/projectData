package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRegisterService service;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String cussave(@RequestBody CustomerDetails customer) {
		System.out.println("hello");
		service.saveCustomer(customer);
		return "data inserted";
	}
	
	@RequestMapping(value = "/getAllData" ,method = RequestMethod.GET)
	public List<CustomerDetails> getAllData()
	{
		 return service.getAllData();
	}
}
