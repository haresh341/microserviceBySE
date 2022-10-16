package com.haresh.addressapp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haresh.addressapp.entity.Address;
import com.haresh.addressapp.repository.AddressRepository;
import com.haresh.addressapp.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse getAddressByEmployeeID(int id) {
		Address add = addressRepository.findAddressByEmployeeId(id);
		AddressResponse adr = modelMapper.map(add, AddressResponse.class);
		return adr;
	}

}
