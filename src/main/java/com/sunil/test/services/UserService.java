package com.sunil.test.services;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.test.user.User;

@RestController
public class UserService {
	
	@GetMapping("/user")
	
	public User userDetails(){
		User user = new User();
		user.setUserId(120);
		user.setUserName("Sunil Dutta");
		user.setUserdept("IT");
		return user;
	}
	
	@PostMapping("/createUser")
	
	public ResponseEntity<?> createUser(@Valid @RequestBody User user){
		HttpHeaders responseHeader = new HttpHeaders();
        return new ResponseEntity<>(user, responseHeader, HttpStatus.CREATED);

		
	}

}
