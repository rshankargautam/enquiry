package com.boot.enquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.enquiry.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{


	public User addUser(User user);

	public User editUser(User user);

	public User deleteUser(int id);
	
	public User findById(int id);

	public User getUserbyUsernamePassword(String username, String password) ;
	
}
