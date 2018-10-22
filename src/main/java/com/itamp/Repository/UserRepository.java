package com.itamp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.itamp.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	User findById(long id);

	
	
}
