package com.boot.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boot.enquiry.entity.User;
import com.boot.enquiry.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository urepo;

	@Override
	public User addUser(User user) {
		
		return urepo.save(user);
	}

	@Override
	public User editUser(User user) {
		
		return urepo.save(user);
	}

	@Override
	public User deleteUser(int id) {
		
		return urepo.deleteUser(id);
	}

	@Override
	public User getUserbyUsernamePassword(String username, String password) {
		
		return urepo.getUserbyUsernamePassword(username, password);
	}

	@Override
	public User findById(int id) {
		
		return urepo.findById(id);
	}


}
