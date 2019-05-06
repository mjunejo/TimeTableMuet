package com.muet.timetable.DAOImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muet.timetable.DAO.FacultyDAO;
import com.muet.timetable.Models.Faculty;
import com.muet.timetable.Repository.*;
import javax.transaction.Transactional;

@Service
@Transactional
public class FacultyDAOImpl implements FacultyDAO {
	
	@Autowired
	FacultyRepository facultyrepository;

	public Faculty addRecord(Faculty ob) {
		// TODO Auto-generated method stub
		return facultyrepository.save(ob);
	}

	public void deleteRecord(int id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Faculty> getRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	public Faculty getRecorbyid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	




	
	
	
	

}
