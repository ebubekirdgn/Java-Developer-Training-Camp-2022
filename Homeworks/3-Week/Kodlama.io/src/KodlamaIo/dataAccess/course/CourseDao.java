package KodlamaIo.dataAccess.course;

import java.util.List;

import KodlamaIo.entities.Course;
import KodlamaIo.entities.Instructor;

public interface CourseDao {
	  void add(Course course);
	  void deleteById(long id);
	  void update(long id);
	  List<Course> getAll();
	  Instructor getAllByInstructorId(long instructorId);
	  boolean existsByName(String name); 
}