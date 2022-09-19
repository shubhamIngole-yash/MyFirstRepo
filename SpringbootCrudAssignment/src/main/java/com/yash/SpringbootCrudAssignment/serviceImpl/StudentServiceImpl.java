package com.yash.SpringbootCrudAssignment.serviceImpl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.SpringbootCrudAssignment.model.Student;
import com.yash.SpringbootCrudAssignment.repository.StudentRepository;
import com.yash.SpringbootCrudAssignment.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveSudent(Student s) {
		// TODO Auto-generated method stub
	
		sr.save(s);
	}
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
	
		return sr.findAll();
	}

	@Override
	public List<Student> deleteStudantDataById(int sid) {
		// TODO Auto-generated method stub
		sr.deleteById(sid);
		return sr.findAll();
		
	}

	
	@Override
	public Student updateStudentData(Student stu) {
		// TODO Auto-generated method stub
	    return sr.save(stu);
	}
	
	@Override
	public Student editStudentDataById(int sid) {
		// TODO Auto-generated method stub
		Student stu= sr.findById(sid).get();
		
		return stu;	
	}
}
