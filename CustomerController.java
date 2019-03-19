package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.entity.Doctor;
import com.cts.entity.Services;
import com.cts.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/servicelist")
	public String serviceList(Model model) {
		
		List<Services> list = customerservice.serviceList();
		System.out.println("service"+list);
		model.addAttribute("service",list);
		return "CustomerHome";
	}
	
	@GetMapping("/doctorList")
public String doctorList(Model model) {
		
		List<Doctor> list = customerservice.doctorList();
		System.out.println("doctor"+list);
		model.addAttribute("doctor",list);
		return "CustomerHome";
	}
	
}
