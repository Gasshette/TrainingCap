package com.ql.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ql.dao.IUserRepository;
import com.ql.entities.User;
import com.ql.services.UserService;

public class UserRestService {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/api/users", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/api/users/{id}", method=RequestMethod.GET)
	public User getOneUser(@PathParam(value = "id") Integer id){
		return userService.getUserById(id);
	}
}
