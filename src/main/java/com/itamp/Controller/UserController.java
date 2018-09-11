package com.itamp.Controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.User;
import com.itamp.Service.Service;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
     Service service;
	@GetMapping("/get")
	public String we() {
		return "work";
	}
	
    @RequestMapping(value="/api", method=RequestMethod.POST)
    public User use(@RequestBody User user ) {
     return service.user(user);
      
    }
    @GetMapping
    public List findAll() {
    	return service.findAll();
    }
    
    
    
    }

