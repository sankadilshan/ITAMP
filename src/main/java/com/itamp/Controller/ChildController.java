package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.Child;
import com.itamp.Service.Service;

@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RestController
@RequestMapping("/api")
public class ChildController {
	
	@Autowired
	private Service service;
	
	@GetMapping("/getc")
	public String work() {
		return "work";
	}
	
	//add one user
	@PostMapping(value="/childadd" , consumes = "application/json")
    public String childAdd(@RequestBody Child child) {
    	return service.addChild(child); 	   
    }
	
	//get all users
    @GetMapping("/allchild")
    public List<Child> findAll() {
    return service.findAllChild();
    }
	
}
