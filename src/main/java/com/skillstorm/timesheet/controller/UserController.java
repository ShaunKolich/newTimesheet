package com.skillstorm.timesheet.controller;

import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.timesheet.beans.User;
import com.skillstorm.timesheet.repository.UserRepository;
import com.skillstorm.timesheet.service.UserService;

@RestController
@RequestMapping(value = "/timesheets")
public class UserController {
	private static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/all")
	public ResponseEntity <List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/user/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<User>> getLogin(@PathVariable String userName){
		return new ResponseEntity<List<User>>(userRepo.findUserID(userName),HttpStatus.OK);
		}
	
	@PostMapping(value= "/user/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<User> addUser(@Valid @RequestBody User user){
		return new ResponseEntity<User>(userRepo.save(user),HttpStatus.OK);
	}
	
	@PutMapping(value = "/user/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
		return new ResponseEntity<User>(userRepo.save(user), HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "/remove/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> deleteUser(@PathVariable int id){
		if (userRepo.findById(id) == null) {
			return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);
		} else {
			userRepo.deleteById(id);
		}
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
