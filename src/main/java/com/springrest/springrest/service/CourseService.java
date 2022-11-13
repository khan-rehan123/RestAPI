package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long couresId);
	
	public Course addCourse(Course course);
	
	//public Course updateById(long courseId);

	Course updateById(long courseId, Course course);

}
