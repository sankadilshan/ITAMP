package com.itamp.Service;

import java.util.List;

import com.itamp.Model.Child;
import com.itamp.Model.User;

public interface Service {
    //for user
	String add(User user);
	User login(String username, String password);
	List<User> findAll();
	User find(long id);
	User delete(User user);
	//String updateUser(User user,long id);
	
	//for child
	String addChild(Child child);
	List<Child> findAllChild();
	User username(String username);
	
	
}
