package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//add one child
	@PostMapping(value="/childadd" , consumes = "application/Json")
    public String childAdd(@RequestBody Child child) {
    	return service.addChild(child); 	   
    }
	//get child posting registrationid
	@PostMapping(value="/registrationid")
	public Child getChild(@RequestBody Child child) {
		
		return service.getchild(child.getRegistrationId());
	}
	
	//get all child
    @GetMapping("/allchild")
    public List<Child> findAll() {
    return service.findAllChild();
    }
    
    //get child by registrationid
	@GetMapping(value="/register")
	public Child regiId(@RequestParam String registrationId) {
		System.out.println("register id******** :"+registrationId);
	  Child child=service.regId(registrationId);
	  if(child !=null)
		  return child;
	  else
		  return null;
	}
	//update child
	@PutMapping(value="/childupdate", consumes="application/json")
	public void updateChild(@RequestBody Child newchild) {
		 if(service.upchild(newchild.getChildId())!=null) {
			 Child ch=new Child();
			 ch.setChildId(newchild.getChildId());
			 ch.setRegistrationId(newchild.getRegistrationId());
			 ch.setRegistrationDate(newchild.getRegistrationDate());
			 ch.setFullName(newchild.getFullName());
			 ch.setHin(newchild.getHin());
			 ch.setDateOfBirth(newchild.getDateOfBirth());
			 ch.setTimeOfBirth(newchild.getTimeOfBirth());
			 ch.setGender(newchild.getGender());
			 ch.setBirthWeight(newchild.getBirthWeight());
			 ch.setPlaceOfBirth(newchild.getPlaceOfBirth());
			 ch.setGuardian(newchild.getGuardian());
			 
			 service.updateCh(ch);
		 }
	}
		 @DeleteMapping("/deletechild")
		 public String deletechild(@RequestParam(required=true, name="registrationId") String registrationId) {
			 Child dchild=service.regId(registrationId);
			 if(dchild!=null) {
				 service.dleteChild(dchild);
				 return "deleted successfully";
			 }
		     
			 else {
				 return "not found child";
			 }
	}
	
}
