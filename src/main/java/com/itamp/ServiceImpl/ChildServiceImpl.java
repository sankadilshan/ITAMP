package com.itamp.ServiceImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itamp.Model.Child;
import com.itamp.Repository.ChildRepository;
import com.itamp.Service.ChildService;

@Service 
public class ChildServiceImpl implements ChildService {
	@Autowired
	private ChildRepository childRepository;
	
	//add child
	@Override
	public String add(Child child) {
	     childRepository.saveAndFlush(child);
		return null;
	}
      //get all child
	@Override
	public List<Child> all() {
	 List<Child> child=childRepository.findAll();
		return child;
	}
	
	//get a child
	@Override
	public Child get(String regiId){
	      Child child=childRepository.findByRegistrationId(regiId);
	      if(child==null)throw new ExceptionHandler(regiId); 
	    	  
	    return child;
	}
	
	//update child
	@Override
	public void update(Child ch) {
		childRepository.save(ch);
	}
	
	//delete child
	@Override
	public String delete(String id) {
	 childRepository.deleteByChildId(id);;
	 return null;	
	}
	
	
	
}
