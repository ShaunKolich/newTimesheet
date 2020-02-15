package com.skillstorm.timesheet.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.timesheet.beans.Timesheet;
import com.skillstorm.timesheet.beans.User;
import com.skillstorm.timesheet.repository.TimesheetRepository;

@Service
public class TimesheetService {
	Logger log = Logger.getLogger(TimesheetService.class);
	
	@Autowired
	private TimesheetRepository timeSheetRepo;
	
	
	
}
