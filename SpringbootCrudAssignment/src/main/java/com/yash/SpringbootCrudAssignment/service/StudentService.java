package com.yash.SpringbootCrudAssignment.service;

import java.util.List;

import com.yash.SpringbootCrudAssignment.model.Student;

public interface StudentService {

	public void saveSudent(Student s);
	public List<Student> getAllStudent();
	public List<Student> deleteStudantDataById(int sid);
	public Student updateStudentData(Student s);
	public Student editStudentDataById(int sid);
	
	
}
