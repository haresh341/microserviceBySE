package com.haresh.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haresh.employeeapp.entity.Employee;
import com.haresh.employeeapp.repository.EmployeeRepository;
import com.haresh.employeeapp.response.EmployeeResponse;

@Service

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeById(int id) {
		Employee emp = employeeRepository.getEmployeeById(id);
		EmployeeResponse employeeResponse = modelMapper.map(emp, EmployeeResponse.class);
		return employeeResponse;
	}
}
