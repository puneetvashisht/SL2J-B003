package springbasic.repos;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import springbasic.entities.Course;

@Repository
public class CourseRepo {
	
	@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init(){
		System.out.println("Initialize JDBC Template...");
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void fetchCourseCount(){
		String sql = "select * from course";
		Map<String, Object> resultMap = jdbcTemplate.queryForMap(sql);
		System.out.println(resultMap);
	}
	
	public Course fetchCourse(int id){
		String sql = "select * from course where id=?";
		Course course = jdbcTemplate.queryForObject(sql, new CourseRowMapper(), id);
		System.out.println(course);
		return course;
	}

}
