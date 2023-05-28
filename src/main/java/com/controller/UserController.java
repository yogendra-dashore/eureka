package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.UserEntity;
import com.repository.UserRepository;

@RestController
@RequestMapping("/admin")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	

	
	@PostMapping("/Adduser")
	public UserEntity addUser(@RequestBody UserEntity userEntity) {
		
		 return userRepository.save(userEntity);
		
	}
	
	@GetMapping("/allGet")
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
		
	}
	
	@DeleteMapping("/UserdeletById/{Id}")
	public UserEntity deleteById(@PathVariable("Id") Integer id) {
		UserEntity user = userRepository.findById(id).get();
		userRepository.delete(user);
		return user;
	}
	
	
}
