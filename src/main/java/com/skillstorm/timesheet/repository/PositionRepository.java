package com.skillstorm.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.timesheet.beans.Position;

public interface PositionRepository extends JpaRepository<Position, Integer>{

}
