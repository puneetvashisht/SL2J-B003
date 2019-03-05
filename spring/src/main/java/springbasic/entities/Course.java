package springbasic.entities;

public class Course {
	
	int id;
	String summary;
	String title;
	
	public Course(){
		
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
