package com.itamp.ServiceImpl;


import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itamp.Model.Child;
import com.itamp.Model.User;
import com.itamp.Repository.ChildRepository;
import com.itamp.Repository.UserRepository;

@Service("Service")
public class ServiceImpl implements com.itamp.Service.Service {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ChildRepository childRepository;

	//for user model..................................
	@Override
	public String add(User user) {
		userRepository.save(user);
		return null;	
	}
	//&& user.getPassword().equals(password)
	@Override
	public User login(String username , String password) {
		User us= userRepository.findByUsername(username);
		if(us ==null || us.getPassword().equals(password)) {
			return us;
		}
		else return null;
		
	}
	
	@Override
	public List<User> findAll() {
		List<User> user=userRepository.findAll();
		return user;
	}
	
	@Override
	public User find(long id) {
	   User user= userRepository.findById(id);
	   if(user !=null) {
		   return user;
		//   return "username :"+name +".   for id:"+id;
	   }
	   return null;
	}
	
/*
	@Override
	public String updateUser(User user, long id) {
		User _user=this.userRepository.findOne(id);
		if(_user !=null) {
			userRepository.save(_user);
			return "update user";
		}
		return null;
	}
   */
	@Override
	public User username(String username) {
		User user=userRepository.findByUsername(username);
		if(user != null) {
		return user;
		}
		else return null;
	}
	
	@Override
	public User delete(User user) {
		userRepository.delete(user);
	    return user;
	}
     
	//for child model................................................
	@Override
	public String addChild(Child child) {
	     childRepository.saveAndFlush(child);
		return null;
	}

	@Override
	public List<Child> findAllChild() {
	 List<Child> child=childRepository.findAll();
		return child;
	}
	
	@Override
	public Child regId(String regiId) {
	      Child child=childRepository.findByRegistrationId(regiId);
	      if(child!=null)
	    	  return  child;
	      else
	    	  return null;
	}
	@Override
	public Child upchild(Long childId) {
		return childRepository.findOne(childId);
	}
	@Override
	public void updateCh(Child ch) {
		childRepository.save(ch);
	}
	@Override
	public void dleteChild(Child dchild) {
		childRepository.deleteByChildId(dchild.getChildId());
		
	}
	
	@Override
	public Child getchild(String registrationId) {
		Child newchild=childRepository.findByRegistrationId(registrationId);
		  if(newchild.getRegistrationId()==registrationId)
			  return newchild;
		  else
		  return null;
	}
	
	
	
}
