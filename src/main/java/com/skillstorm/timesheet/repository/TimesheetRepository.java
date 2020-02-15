package com.skillstorm.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.timesheet.beans.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, Integer>{

	
}
