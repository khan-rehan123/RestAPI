package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/save")
	public String save() {
		
		return "Hello rehan khan";
	}
	
//	get the course
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	@GetMapping("/coures/{couresId}")
	public Course getCoures(@PathVariable String couresId) {
		
		return this.courseService.getCourse(Long.parseLong(couresId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/coures/{couresId}")
	public Course updateById(@PathVariable String couresId,@RequestBody Course course) {
		//Long updateById = course.getId();
		return  this.courseService.getCourse(Long.parseLong(couresId));
               
		
	}
	

}
