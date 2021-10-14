package com.boot.enquiry.service;

import org.springframework.stereotype.Service;

import com.boot.enquiry.entity.User;

public interface UserService {

	public User addUser(User user);

	public User editUser(User user);

	public User deleteUser(int id);
	
	public User findById(int id);

	public User getUserbyUsernamePassword(String username, String password) ;
}
