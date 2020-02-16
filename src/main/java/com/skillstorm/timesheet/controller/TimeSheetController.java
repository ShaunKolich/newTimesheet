package com.skillstorm.timesheet.controller;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.timesheet.beans.Timesheet;
import com.skillstorm.timesheet.beans.User;
import com.skillstorm.timesheet.repository.PositionRepository;
import com.skillstorm.timesheet.repository.TimesheetRepository;
import com.skillstorm.timesheet.repository.UserRepository;
import com.skillstorm.timesheet.service.TimesheetService;


@RestController
@RequestMapping(value = "/timesheets")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class TimeSheetController {

	Logger log = Logger.getLogger(TimeSheetController.class);

	@Autowired
	private TimesheetRepository timeSheetRepo;
	// all time sheets

	@Autowired
	private PositionRepository positionRepo;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private TimesheetService timeSheetService;

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Timesheet>> findAllTimesheet() {
		return new ResponseEntity<List<Timesheet>>(timeSheetRepo.findAll(), HttpStatus.OK);
	}

	@GetMapping(value = "/timesheet/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Timesheet findById(@PathVariable int id) {
		Optional<Timesheet> opt = timeSheetRepo.findById(id);
		if (opt.isPresent()) {
			log.info(timeSheetRepo.findById(id));
			return opt.get();
			
		} else {
			return new Timesheet();
		}
	}
	
	@PostMapping(value = "/timesheet/create",consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity <Timesheet> createTimeSheet(@RequestBody Timesheet timesheet){
		return new ResponseEntity<Timesheet>(timeSheetRepo.save(timesheet),HttpStatus.OK);
	}

	@PutMapping(value = "/timesheet/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<Timesheet> updateTimesheet(@RequestBody Timesheet timesheet){
		return new ResponseEntity<Timesheet>(timeSheetRepo.save(timesheet),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/timesheet/{id}")
	public ResponseEntity<Timesheet> deleteTimesheet(@PathVariable int id){
		
		if (timeSheetRepo.findById(id) == null) {
			return new ResponseEntity<Timesheet>(HttpStatus.UNAUTHORIZED);
		} else {
			timeSheetRepo.deleteById(id);
		}
		return new ResponseEntity<Timesheet>(HttpStatus.OK);
	}
	
}
