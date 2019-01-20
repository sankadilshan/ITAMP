package com.itamp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.User;
import com.itamp.Service.UserService;
import com.itamp.ServiceImpl.ExceptionHandler;

import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping("/user")
@RestController
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
    private UserService userService;
	
	//using username
	@GetMapping("/{username}")
	public String get(@PathVariable String username) {
		 return  userService.get(username);
		
	}
	
	//add one user
	@PostMapping( consumes = "application/json")
    public void add(@RequestBody User user) {
    	 userService.add(user); 	   
    }
	
	//get all users
    @GetMapping()
    public List<User> all() {
    return userService.all();
    }
    
    //get user using id
    @GetMapping("/{id}")
    public User userid(@PathVariable Long id) {
     return	userService.find(id);
    	
    }
    
    //login
    @PostMapping("/login")
    public User login( @PathVariable User user) {
    	return userService.login(user.getUsername(),user.getPassword());
    	
    }
    
    //update user 
  /*  @PutMapping("/{id}")
    public String updateUser(@RequestBody User user,@PathVariable long id) {
    	return service.updateUser(user,id);
    }*/
    
    //delete user
    @DeleteMapping("/{id}")
    	public void delete(@PathVariable Long id) {
    		userService.delete(id);
    }
    
    
    
    @RequestMapping("/login")
	public Principal user(Principal principal) {
	 logger.info("user logged "+principal);
		return principal;
	}
    
    
    }

