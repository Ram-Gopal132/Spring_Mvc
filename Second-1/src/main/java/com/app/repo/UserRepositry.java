package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.User;


public interface UserRepositry  extends JpaRepository<User,Integer>{
	
	


}
