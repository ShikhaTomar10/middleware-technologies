package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/subjects")
	
	public List<Subject> getAllSubjects(){
		return service.getAllSubjects();
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		service.addSubject(subject);
	}
	@RequestMapping(method=RequestMethod.POST, value="/subjects/{id}")
	public void addSubject(@PathVariable String id,@RequestBody Subject subject) {
		service.updateSubject(id,subject);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/subjects/{id}")
	public void DeleteSubject(@PathVariable String id) {
		service.deleteSubject(id);
	}

}
