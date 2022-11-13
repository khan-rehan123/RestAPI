package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl  implements CourseService{

	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(123,"java course","this is a basice course"));
		list.add(new Course(234,"spting course","this is a spring course"));
		
		
	}
	
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long couresId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==couresId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateById(@PathVariable long courseId,@RequestBody Course course) {
		long updateById =course.getId();
		return course;
	}

//	@Override
//	public Course putCourse(Course course) {
//		list.remove(course);
//		
//		return course;
//	}
	
	
}
