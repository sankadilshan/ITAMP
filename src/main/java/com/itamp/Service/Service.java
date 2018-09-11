package com.itamp.Service;

import java.util.List;

import com.itamp.Model.User;

public interface Service {

	User user(User user);

	User loginUser(String username, String password);

	List findAll();

	

}
