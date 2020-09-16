package com.skillstorm.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.timesheet.beans.Timesheet;
import com.skillstorm.timesheet.beans.User;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Integer>{

	@Modifying
	@Query("from User where USER_NAME = ?1")
	public User findIdByUserName(String userName); 
	
	
}
