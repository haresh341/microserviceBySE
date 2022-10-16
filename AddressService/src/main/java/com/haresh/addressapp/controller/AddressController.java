package com.haresh.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.haresh.addressapp.AddressService;
import com.haresh.addressapp.response.AddressResponse;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/addresses/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressDetailsByEmployeeId(@PathVariable("employeeId")int id) {
		AddressResponse adr = addressService.getAddressByEmployeeID(id);
		return ResponseEntity.status(HttpStatus.OK).body(adr);
	}

}
