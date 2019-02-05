package com.sunil.test.services;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.test.user.Customer;

@RestController
public class CustomerService {
	
	@PostMapping("/createCustomer")
	
	public ResponseEntity<?> createCustomer(@Valid @RequestBody Customer customer){
		HttpHeaders responseHeader = new HttpHeaders();
        return new ResponseEntity<>(customer, responseHeader, HttpStatus.CREATED);

	}

}
