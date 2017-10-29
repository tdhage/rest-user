package com.id.test.restuser.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.id.test.restuser.model.User;
import com.id.test.restuser.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class CUDController {

	private static final Logger LOGGER = Logger.getLogger(CUDController.class.getName());
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "create", method = RequestMethod.POST, consumes = "application/json")
	public String create(@RequestBody User user) {
		userRepository.save(user);
		LOGGER.info("Created User Successfully");
		return "Created User Successfully.... ";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST, consumes = "application/json")
	public String update(@RequestBody User user) {
		userRepository.save(user);
		LOGGER.info("Updated User Successfully");
		return "Updated User Sucessfully... ";
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id) {
		User user = userRepository.findOne(id);
		user.setActive(false);
		userRepository.save(user);
		LOGGER.info("Deactivated User Successfully");
		return "Deactivated User Successfully... ";
	}
}
