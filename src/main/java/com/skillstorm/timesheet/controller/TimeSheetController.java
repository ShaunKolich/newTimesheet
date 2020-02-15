package com.skillstorm.timesheet.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skillstorm.timesheet.beans.Timesheet;
import com.skillstorm.timesheet.beans.User;
import com.skillstorm.timesheet.repository.PositionRepository;
import com.skillstorm.timesheet.repository.TimesheetRepository;
import com.skillstorm.timesheet.repository.UserRepository;


@RestController
@RequestMapping(value = "/timesheets")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class TimeSheetController {

	private static final Logger log = Logger.getLogger(TimeSheetController.class);
	
	@Autowired
	private TimesheetRepository timeSheetRepo;
	// all time sheets
	
	@Autowired 
	private PositionRepository positionRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Timesheet>> findAllTimesheet(){
		return new ResponseEntity<List<Timesheet>>(timeSheetRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/timesheet/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getTimeSheetByName(@PathVariable String userName){
		
//		User user = userRepo.
		
		return null;
	}
	
}
