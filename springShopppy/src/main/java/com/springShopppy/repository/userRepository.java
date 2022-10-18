package com.springShopppy.repository;

import com.springShopppy.model.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository  extends JpaRepository<users,Integer>{
	
	users findByUsername(String username);

}
