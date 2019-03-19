package com.cts.services;

import java.util.List;

import com.cts.entity.Doctor;
import com.cts.entity.Services;

public interface CustomerService {
 public List<Services> serviceList();
 public List<Doctor> doctorList();
}
