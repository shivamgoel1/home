package com.cts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CustomerDAO;
import com.cts.entity.Doctor;
import com.cts.entity.Services;

@Service("customerservice")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO customerdao;
	
	@Override
	public List<Services> serviceList() {
		// TODO Auto-generated method stub
		return customerdao.serviceList();
	}

	@Override
	public List<Doctor> doctorList() {
		// TODO Auto-generated method stub
		return customerdao.doctorList();
	}

}
