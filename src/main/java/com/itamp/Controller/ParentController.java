package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.Mother;
import com.itamp.Repository.MotherRepository;

@RequestMapping("/api")
@RestController
public class MotherController {
	 @Autowired
      private MotherRepository motherRepository;
      
      @GetMapping("allmother")
      public List<Mother> getMother(){
    	return  motherRepository.findAll();
      }
}
