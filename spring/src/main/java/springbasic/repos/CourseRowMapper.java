package springbasic.repos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springbasic.entities.Course;

public class CourseRowMapper implements RowMapper<Course>{

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt(1);
		String summary = rs.getString(2);
		String title = rs.getString(3);
		
		Course course = new Course(id, summary, title);
		return course;
	}

}
