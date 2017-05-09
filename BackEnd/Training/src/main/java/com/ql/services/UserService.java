package com.ql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ql.dao.IUserRepository;
import com.ql.entities.User;

@RestController
public class UserService {
	
	@Autowired
	IUserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Integer id){
		return userRepository.findOne(id);
	}
}
