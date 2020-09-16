package com.skillstorm.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.timesheet.beans.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer>{

}
