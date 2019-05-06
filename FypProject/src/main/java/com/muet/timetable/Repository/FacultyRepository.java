package com.muet.timetable.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muet.timetable.Models.*;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {

	

}
