package com.yash.SpringbootCrudAssignment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.SpringbootCrudAssignment.model.Student;
import com.yash.SpringbootCrudAssignment.service.StudentService;

@RestController
public class StudentFormController {

	@Autowired
	StudentService hs;

	// For post the student data
	@PostMapping("/postData")
	public String saveData(@RequestBody Student stu) {

		hs.saveSudent(stu);
		return "Student data saved successfully......";
	}

	// For get all Student data
	@GetMapping("/GetAllStudentData")
	public List<Student> getAllStudentData() {
		List<Student> student = new ArrayList<>();
		if (student.isEmpty()) {
			System.out.println("student is empty");
		}
		return hs.getAllStudent();
	}

	// for delete student data by perticular id
	@DeleteMapping("/deleteStudentDataById/{sid}")
	public List<Student> deleteDataById(@PathVariable int sid) {
		return hs.deleteStudantDataById(sid);
	}

	// for edit student data
	@GetMapping("/editDataById/{sid}")
	public Student editDataById(@PathVariable int sid) {
		return hs.editStudentDataById(sid);
	}

	// for updating the student data
	@PutMapping("/updateStudentData")
	public String updateStudentData(@RequestBody Student stu) {
		// TODO Auto-generated method stub
		hs.updateStudentData(stu);
		return "Data updated sucessfully...";
	}

}
