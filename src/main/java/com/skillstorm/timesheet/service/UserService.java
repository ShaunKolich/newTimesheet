package com.skillstorm.timesheet.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.timesheet.beans.User;
import com.skillstorm.timesheet.repository.UserRepository;

@Service
public class UserService {
	Logger log = Logger.getLogger(TimesheetService.class);
	
	@Autowired
	private UserRepository userRepo;
	
	public User login(String userName) {
		
		
		return null;
	}
}
