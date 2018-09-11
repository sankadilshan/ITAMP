package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.itamp.Model.User;

public interface Repository extends JpaRepository<User,String > {
	User save(User user);
}
