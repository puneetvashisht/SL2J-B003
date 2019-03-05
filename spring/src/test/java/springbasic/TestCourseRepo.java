package springbasic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbasic.entities.Course;
import springbasic.repos.CourseRepo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestCourseRepo {
	
	@Autowired
	CourseRepo repo;

//	@Test
	public void testRecordsInCourses() {
		
		repo.fetchCourseCount();
	}

	@Test
	public void testCourseWithId() {
		
		Course course = repo.fetchCourse(1);
		assertEquals(1, course.getId());
	}
}
