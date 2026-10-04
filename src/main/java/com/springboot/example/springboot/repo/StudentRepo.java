package com.springboot.example.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.example.springboot.entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer>{
	
	StudentEntity findById(int sid);

}
