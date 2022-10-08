package KodlamaIo.dataAccess.instructor;

import java.util.List;
import KodlamaIo.entities.Course;
import KodlamaIo.entities.Instructor;

public interface InstructorDao {
	  void add(Instructor instructor);
	  void deleteById(long id);
	  void update(long id);
	  void getInstructors();
	  List<Course> getAllByCoursesId(long courseId);
}
