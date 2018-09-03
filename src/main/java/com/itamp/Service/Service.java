package com.itamp.Service;

import com.itamp.Model.User;

public interface Service {

	void user(User user);

	User loginUser(String username, String password);

}
