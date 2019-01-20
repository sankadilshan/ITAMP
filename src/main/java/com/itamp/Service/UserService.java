package com.itamp.Service;

import java.util.List;

import com.itamp.Model.User;

public interface UserService {
	void add(User user);
	User login(String username, String password);
	String get(String username);
	List<User> all();
	User find(Long id);
	void delete(Long id);

}
