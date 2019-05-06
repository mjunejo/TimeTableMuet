package com.muet.timetable.DAO;

import java.util.ArrayList;

import com.muet.timetable.Models.Faculty;


public interface FacultyDAO {
	
	    public Faculty addRecord(Faculty ob);
		  
		public void deleteRecord(int id);
		
		public ArrayList<Faculty> getRecord();
		
		public Faculty getRecorbyid(); 
}
