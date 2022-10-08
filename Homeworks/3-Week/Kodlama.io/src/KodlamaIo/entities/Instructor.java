package KodlamaIo.entities;

import java.util.List;

public class Instructor {
	
	private long  id;
    private String firstName;
    private String lastName;
	private List<Course> instructorCourses;
	
	public Instructor(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Course> getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(List<Course> instructorCourses) {
		this.instructorCourses = instructorCourses;
	}
	  
	  
}