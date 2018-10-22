package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.Guardian;
import com.itamp.Repository.GuardianRepository;

@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RestController
@RequestMapping("/api")
public class GuardianController {
	@Autowired
	 private GuardianRepository guardianRepository;

	@PostMapping(value="/guardian", consumes="application/json")
	public Guardian add(@RequestBody Guardian guardian) {
		      return  guardianRepository.save(guardian);
	}
	@GetMapping
	public List<Guardian> guardians(){
		return  guardianRepository.findAll();
	}
	
}
