package com.itamp.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.AdditionalInfo;
import com.itamp.Model.Parent;
import com.itamp.Repository.AddinfoRepository;
import com.itamp.Repository.ParentRepository;

//@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RequestMapping("/api")
@RestController
public class ParentController {
	 @Autowired
      private ParentRepository parentRepository;
	 @Autowired AddinfoRepository addinfoRepository;
      
      @GetMapping("/allparents")
      public List<Parent> getParents(){
    	return  parentRepository.findAll();
      }
      
      @PostMapping(value="/addparent")
      public ResponseEntity<?> addParent( @RequestBody Parent parent ) {
    	  
    	  try {
    		// parentRepository.save(parent);
    		/* HttpHeaders httpHeaders=new HttpHeaders();
    		  return ResponseEntity.status(HttpStatus.CREATED)
                      .headers(httpHeaders)
                      .body();*/
    		  System.out.println("parent"+parent);
    		  //System.out.println("additonal"+additional);
    		 return ResponseEntity.ok(parent);
    		 // return null;
    	  }
    	  catch(Exception e){
    		  e.printStackTrace();
              return null;
    	  }
    	
      }
    
}
