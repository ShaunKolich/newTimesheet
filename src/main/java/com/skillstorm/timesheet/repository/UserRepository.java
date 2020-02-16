package com.skillstorm.timesheet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.timesheet.beans.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	@Modifying
	@Query("select u from User u where u.userName = ?1")
	public List<User> findUserID(String userName);
	
	
}
