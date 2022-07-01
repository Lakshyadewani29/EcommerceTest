package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Login;
import com.atcs.ecommerce.entity.User;
import com.atcs.ecommerce.repo.LoginRepo;
import com.atcs.ecommerce.repo.UserRepo;
import com.atcs.ecommerce.service.LoginService;

@Component
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepo loginRepo;
	@Autowired
	UserRepo registerRepo;
	
	@Override
	public void post(Login login) {
		List<User> ls = registerRepo.findAll();
		for(User us: ls) {
			if(us.getFirstname()==login.getUserName() && us.getPassword()==login.getPassword()) {
				loginRepo.save(login);
			}
			
		}
		
	}

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
