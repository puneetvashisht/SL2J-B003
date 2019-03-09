package com.cts.sl2jb003springboot.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.sl2jb003springboot.entities.Course;

public interface CoursesRepo extends JpaRepository<Course, Integer> {
	
	public Course findCourseByTitle(String title);

}
