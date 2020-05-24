package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerRegisterRepo;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {
	
	@Autowired
	CustomerRegisterRepo rep;
	
	@Override
	public void saveCustomer(CustomerDetails customer) {
		
		System.out.println("Customer Repository");
		rep.save(customer);
	}

	@Override
	public List<CustomerDetails> getAllData() {
		
		return rep.findAll();
		
	}

}
