package com.codewithshivendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.codewithshivendra.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);
	

}
