package com.example.SpringJPA.service;

import com.example.SpringJPA.Employee;
import com.example.SpringJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


}
