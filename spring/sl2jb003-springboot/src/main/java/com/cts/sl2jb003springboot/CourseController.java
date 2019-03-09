package com.cts.sl2jb003springboot;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sl2jb003springboot.entities.Course;
import com.cts.sl2jb003springboot.repos.CoursesRepo;

@RestController
public class CourseController {
	
	@Autowired
	CoursesRepo repo;
	
	@RequestMapping(path="/courses/{id}", method=RequestMethod.GET)
	public Course getCourse(@PathVariable("id") int id){
		
//		Course course = new Course(12, "from facebook@", "React");

		System.out.println(id);
		Course course = null;
		try{
			course = repo.getOne(id);
			System.out.println(course);
		}
		catch(EntityNotFoundException e){
//			e.printStackTrace();
			System.out.println("Catch the non existing object call here....");
			throw new CourseNotFoundException("Course not found with id: "+ id);
		}
		
		return course;
		
	}
	
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public List<Course> getAllCourses(){
		return repo.findAll();
	}
	
	@RequestMapping(path="/courses", method=RequestMethod.POST)
	public ResponseEntity<Void> addCourse(@RequestBody Course course){
		
		Course courseExisting = repo.findCourseByTitle(course.getTitle());
		ResponseEntity<Void> response = null;
		if(courseExisting==null){
			repo.save(course);
			response = new ResponseEntity<>(HttpStatus.CREATED);
		}
		else{
			response = new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return response;
		
	}

}
