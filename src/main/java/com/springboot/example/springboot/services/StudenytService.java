package com.springboot.example.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.example.springboot.entity.StudentEntity;
import com.springboot.example.springboot.repo.StudentRepo;


@Component
public class StudenytService 
{	
	
	@Autowired
	StudentRepo sr;
	
	public List<StudentEntity> bringAllStudent() {
		return (List<StudentEntity>) sr.findAll();
	}

	public StudentEntity bringOne(int sid) {
		
		return sr.findById(sid);
	}

	public String insert(StudentEntity s) {
		sr.save(s);
		return "success";
		
	}

	public String delete(int sid) {
		StudentEntity se = bringOne(sid);
		sr.delete(se);
		return "success";
	}

	public String update(int sid, StudentEntity s) {
		StudentEntity se = bringOne(sid);
		se.setEmail(s.getEmail());
		sr.save(se);
		return "success";
	}
}
