package com.haresh.employeeapp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeAppConfiguration {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
