package com.cts.sl2jb003springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="course4")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String summary;
	String title;
	
	public Course(){
		
	}
	public Course(String summary, String title) {
		super();
		this.summary = summary;
		this.title = title;
	}
	
	public Course(int id, String summary, String title) {
		super();
		this.id = id;
		this.summary = summary;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", summary=" + summary + ", title=" + title + "]";
	}
	

}

