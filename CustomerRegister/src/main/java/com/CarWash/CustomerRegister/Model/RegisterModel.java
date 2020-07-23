package com.CarWash.CustomerRegister.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RegisterModel 
{
	@Id
	private String name;
	private String email;
	private Integer mobilenumber;
	private String password;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public RegisterModel(String name, String email, Integer mobilenumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterModel [name=" + name + ", email=" + email + ", mobilenumber=" + mobilenumber + ", password="
				+ password + "]";
	}
	
	
	
	
	

}
