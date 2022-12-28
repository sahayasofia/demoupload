package com.faith.app.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.User;
import com.faith.app.service.IUserService;


@CrossOrigin //avoid conflict of port number in rest 
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/users/{userName}&{password}")
	public User findByUserByNameandPassword(@PathVariable String userName,@PathVariable String password) {
		return userService.findByUserByNameandPassword(userName, password);
		
	}
}
