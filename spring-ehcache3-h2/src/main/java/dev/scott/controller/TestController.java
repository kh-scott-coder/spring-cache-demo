package dev.scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.scott.entity.User;
import dev.scott.service.UserService;

@RestController
@RequestMapping(value = "/api")
public class TestController {

	@Autowired
	private UserService userService;

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping(value = "/user/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") String userId) {
		User user = userService.getUser(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}