package com.itamp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itamp.Model.User;
import com.itamp.Service.Service;


@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
     Service service;
	
	
    @RequestMapping("/login")
    public String login() {
    	return "login";
    }
    @PostMapping(value="save-user")
    public String use(@RequestParam("username") String username,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
    		@RequestParam("password") String password, Model model ) {
    User user=new User(username,firstname,lastname,password);
   
    	service.user(user);
    	model.addAttribute("success", "<h2><b><i>successfully registered</i></b></h2>");
    	return "login";
    }
    
    @RequestMapping("/register")
    	public String register() {
    		return "register";
    	}
    @PostMapping("login-user")
   	public String  varify(@RequestParam String username, @RequestParam String password, HttpSession httpSession,Model model) {
       	User user= service.loginUser(username,password);
       	if(user == null) {
       		model.addAttribute("loginerror","</h3><b><i>invalid user name or password</h3></b></i>");
       		return "login";
       	}
       	else {
       		httpSession.setAttribute("logeduser" , user.getFirstName());
   		return "welcome";
   	}
    }
}
