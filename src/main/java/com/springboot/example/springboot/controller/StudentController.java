package com.springboot.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.springboot.entity.StudentEntity;
import com.springboot.example.springboot.services.StudenytService;

@RestController
public class StudentController {
	
	
	@Autowired
	StudenytService ss;
	
	@GetMapping("/getstudents")
	List<StudentEntity> getAllStudent() {
		return ss.bringAllStudent();
	}
	
	@GetMapping("/getOne/{id}")
	StudentEntity getOne(@PathVariable ("id") int sid) {
		return ss.bringOne(sid);
	}
	
	@PutMapping("/insert")
	String insert(@RequestBody StudentEntity s) {
		return ss.insert(s);
	}
	
	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable ("id") int sid) {
		return ss.delete(sid);
	}
	
	@PostMapping("/update/{id}")
	String update(@PathVariable("id") int sid, @RequestBody StudentEntity s) {
		return ss.update(sid,s);
	}
	
	

}
