package com.CarWash.CustomerRegister.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarWash.CustomerRegister.Model.RegisterModel;
import com.CarWash.CustomerRegister.Repository.RegisterRepository;

@Service
public class RegisterService 
{
	
	
	@Autowired
	private RegisterRepository Repo;
	
	public List<RegisterModel> getcustomer() {
		return Repo.findAll();
	}
	
	public RegisterModel addcustomer(RegisterModel c) {
		return Repo.save(c);
	}
	
	public RegisterModel loginValidate(RegisterModel customer) {
		Optional<RegisterModel> available=Repo.findById(customer.getName());
		if(available.isPresent()) {
			RegisterModel isThere= available.get();
			if(isThere.getPassword().contentEquals(customer.getPassword())){
				return isThere;
			}
		}
		
		return null;
		
		
	}

}
