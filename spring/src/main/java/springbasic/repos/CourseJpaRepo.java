package springbasic.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springbasic.entities.Course;

@Repository
public class CourseJpaRepo {
	
	@PersistenceContext
	EntityManager em;
	
	
	
	public Course fetchCourse(int id){
		return em.find(Course.class, id);
//		String sql = "select * from course where id=?";
//		Course course = jdbcTemplate.queryForObject(sql, new CourseRowMapper(), id);
//		System.out.println(course);
//		return course;
	}


	@Transactional
	public void addCourse(Course course) {
		em.persist(course);
		
	}

}
