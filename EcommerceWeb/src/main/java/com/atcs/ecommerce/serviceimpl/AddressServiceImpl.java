package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Address;
import com.atcs.ecommerce.repo.AddressRepo;
import com.atcs.ecommerce.service.AddressService;

@Component
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepo addressrepo;
	
	@Override
	public List<Address> getAllAddress() {
		
		return addressrepo.findAll();
	}

	@Override
	public Address findAddressById(int id) {
		
		return addressrepo.findById(id).get();
	}

	@Override
	public void postData(Address address) {
	
		addressrepo.save(address);
		
	}

	@Override
	public void putData(Address address) {
		addressrepo.save(address);
		
	}

	@Override
	public void deleteAddressById(int id) {

		addressrepo.deleteById(id);
		
	}
}
