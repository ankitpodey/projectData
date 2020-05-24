package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;

public interface CustomerRegisterService {
	
	void saveCustomer(CustomerDetails customer);
	public List<CustomerDetails> getAllData();
}
