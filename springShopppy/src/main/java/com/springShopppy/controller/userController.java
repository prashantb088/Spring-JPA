package com.springShopppy.controller;

import com.springShopppy.Service.userService;
import com.springShopppy.model.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springShopppy.model.login;

public class userController {
	
	@Autowired
	private userService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/createnewacount" )
	public String createNew(@RequestBody users u1) {
		
		return service.createNew(u1);
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/login")
	public String login(@RequestBody login l1) {
		return service.login(l1);
	}

}
