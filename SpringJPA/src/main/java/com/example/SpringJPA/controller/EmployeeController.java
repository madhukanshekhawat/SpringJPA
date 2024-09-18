package com.example.SpringJPA.controller;

import com.example.SpringJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//api
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;

}


