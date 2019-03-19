package com.cts.dao;

import java.util.List;

import com.cts.entity.Doctor;
import com.cts.entity.Services;

public interface CustomerDAO {
 public List<Services> serviceList();
 public List<Doctor> doctorList();
}
