package com.itamp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itamp.Model.User;
import com.itamp.Repository.UserRepository;
import com.itamp.Service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void add(User user) {
		userRepository.save(user);	
	}

	@Override
	public User login(String username , String password) {
		User us= userRepository.findByUsername(username);
		if(us ==null || us.getPassword().equals(password)) {
			 return null;
		}
		else return us;
		
	}
	
	@Override
	public List<User> all() {
		List<User> user=userRepository.findAll();
		return user;
	}
	
	@Override
	public User find(Long id) {
	   User user= userRepository.findById(id);
	   if(user !=null) {
		   return user;
	   }
	   else
	   return null;
	}
	
	@Override
	public String get(String username) {
		String user=userRepository.findByUsername(username).getUsername();
		if(user == null)throw new ExceptionHandler("not found user",username);
			
		return user;
	}
	
	@Override
	public void delete(Long id) {
		userRepository.delete(id);
	    
	}

}
