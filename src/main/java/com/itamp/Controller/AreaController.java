package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.Area;
import com.itamp.Repository.AreaRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RequestMapping("/api")
public class AreaController {
     @Autowired
     private AreaRepository areaRepository;
     
     @PostMapping(value="/addarea", consumes="application/json")
     public void oneArea(@RequestBody Area area) {
    	 areaRepository.saveAndFlush(area);
     }
     @GetMapping("/area")
     public List<Area> allArea(){
    	 return areaRepository.findAll();
     }
     
}
