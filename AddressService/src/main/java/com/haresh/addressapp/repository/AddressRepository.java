package com.haresh.addressapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haresh.addressapp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	Address findAddressByEmployeeId(int id);

}
