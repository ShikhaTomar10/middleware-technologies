package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository repository;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects=new ArrayList<>();
		repository.findAll().forEach(subjects::add);
		return subjects;
		
	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		repository.save(subject);
	}

	public void updateSubject(String id,Subject subject) {
		// TODO Auto-generated method stub
		repository.save(subject);
	}

	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
