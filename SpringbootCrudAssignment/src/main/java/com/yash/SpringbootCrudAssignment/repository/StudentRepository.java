package com.yash.SpringbootCrudAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.SpringbootCrudAssignment.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
