package com.haresh.addressapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressAppConfiguration {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
