package com.itamp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.User;
import com.itamp.Service.Service;
import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RequestMapping("/api")
@RestController
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
    private Service service;
	
	@GetMapping(value="/get")
	public String we() {
		return "work";
	}
	//using username
	@GetMapping(value="/username")
	public String username(@RequestParam String username) {
		User user= service.username(username);
		if(user!=null) {
			return user.getFirstname()+" "+user.getLastName();
		}
		else return "error";
	}
	
	//add one user
	@PostMapping(value="/useradd" , consumes = "application/json")
    public String use(@RequestBody User user) {
    	return service.add(user); 	   
    }
	
	//get all users
    @GetMapping("/all")
    public List<User> findAll() {
    return service.findAll();
    }
    
    //get user using id
    @GetMapping("/{id}")
    public User oneUser(@PathVariable long id) {
     return	service.find(id);
    	
    }
    
    //login
    @PostMapping(value="/login")
    public User login( @RequestBody User user1) {
    	return service.login(user1.getUsername(),user1.getPassword());
    	
    }
    
    //update user 
  /*  @PutMapping("/{id}")
    public String updateUser(@RequestBody User user,@PathVariable long id) {
    	return service.updateUser(user,id);
    }*/
    
    //delete user
    @DeleteMapping("/delete")
    	public User deleteUser(@RequestBody User user) {
    		return service.delete(user);
    }
    
    
    
    @RequestMapping("/login")
	public Principal user(Principal principal) {
	 logger.info("user logged "+principal);
		return principal;
	}
    
    
    }

