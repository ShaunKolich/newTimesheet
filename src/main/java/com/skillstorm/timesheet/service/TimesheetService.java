package com.skillstorm.timesheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.timesheet.beans.Timesheet;
import com.skillstorm.timesheet.repository.TimesheetRepository;

@Service
public class TimesheetService {

	
	@Autowired
	private TimesheetRepository timeSheetRepo;
	
	
	public List<Timesheet> findTimeSheetbyUserName() {
		
		
		return null;
	}
	
	
}
