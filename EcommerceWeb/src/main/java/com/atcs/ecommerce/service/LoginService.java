package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Login;

@Service
public interface LoginService {

	void post(Login login);
	List<Login> getAll();
}
