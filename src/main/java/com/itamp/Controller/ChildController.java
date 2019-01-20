package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.Child;
import com.itamp.Service.ChildService;

@RestController
@RequestMapping("/child")
public class ChildController {
	
	@Autowired
	private ChildService childService;
	
	//add one child
	@PostMapping( consumes = "application/Json")
    public String add(@RequestBody Child child) {
    	return childService.add(child); 	   
    }
	
	//get all child
    @GetMapping()
    public List<Child> all() {
    return childService.all();
    }
    
    //get child by registrationid
	@GetMapping("/{id}")
	public Child get(@PathVariable String id) {
	  Child child=childService.get(id);
	 return child;
	}
	//update child
	@PutMapping( consumes="application/json")
	public void update(@RequestBody Child child) {
		 childService.update(child);
		 }
	
		 @DeleteMapping("/{id}")
		 public String delete(@PathVariable String registrationId) {
		     childService.delete(registrationId);
	        return null;      
    }
}
