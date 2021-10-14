package com.boot.enquiry.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.boot.enquiry.entity.Enquiry;
import com.boot.enquiry.entity.User;
import com.boot.enquiry.service.EnquiryService;
import com.boot.enquiry.service.UserService;

@RestController
public class EnquiryController {

	@Autowired
	private EnquiryService enqService;
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}

	@PutMapping("/user")
	public User editUser(User user) {

		return userService.editUser(user);
	}

	@DeleteMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id) {

		return userService.findById(id);
	}

	@DeleteMapping("/user/{username}/{password}")
	public User authenticateUser(@PathVariable("username") String username, @PathVariable("password") String password) {

		return userService.getUserbyUsernamePassword(username, password);
	}

	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable("id") int id) {

		return userService.deleteUser(id);
	}

	@PostMapping("/enquiry")
	public Enquiry addEnquiry(Enquiry enq) {
		Enquiry e = this.enqService.addEnquiry(enq);
		System.out.println(enq);
		return e;
	}

	@GetMapping("/enquiry/{title}")
	public List<Enquiry> getEnquiryByTitle(@PathVariable("title") String enqTitle) {

		return enqService.getEnquiryByTitle(enqTitle);
	}

	@GetMapping("/enquiry/today")
	public List<Enquiry> getEnquiryByToday() {

		return enqService.getEnquiryOfToday();
	}

	@GetMapping("/enquiries")
	public List<Enquiry> getAllEnquiries(Enquiry enq) {

		return enqService.getAllEnquiries();
	}

	@PutMapping("/enquiry")
	public Enquiry editEnquiry(@RequestBody Enquiry enq) {

		return enqService.editEnquiry(enq);
	}

	@DeleteMapping("/enquiry/{id}")
	public Enquiry deleteEnquiry(@PathVariable("id") int id) {

		return enqService.deleteById(id);
	}
}
