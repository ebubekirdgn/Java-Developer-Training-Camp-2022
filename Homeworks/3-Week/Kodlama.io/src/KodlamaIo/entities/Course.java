package KodlamaIo.entities;

import java.util.List;

public class Course {
	private long  id;
	private String courseName;
	private int unitPrice;
	private Instructor instructor;
	
	public Course(long id, String courseName, int unitPrice, Instructor instructor) {
		this.id = id;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
		this.instructor = instructor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Instructor getInstructors() {
		return instructor;
	}

	public void setInstructors(Instructor instructor) {
		this.instructor = instructor;
	}	
}