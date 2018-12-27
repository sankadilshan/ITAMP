package com.itamp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.AdditionalInfo;
import com.itamp.Repository.AddinfoRepository;

@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
@RequestMapping("/api")
@RestController
public class AddinfoController {
  @Autowired
  private AddinfoRepository addInfoRepository;
  
  @PostMapping(value="/addinfos", consumes="application/Json")
  public void addinfo(@RequestBody AdditionalInfo addinfo) {
	  addInfoRepository.saveAndFlush(addinfo);
  }
  @GetMapping("/getaddinfo")
  public List<AdditionalInfo> addinfoget(){
	  return addInfoRepository.findAll();
  }
}
