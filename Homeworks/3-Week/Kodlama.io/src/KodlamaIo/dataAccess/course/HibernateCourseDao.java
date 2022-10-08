package KodlamaIo.dataAccess.course;

import java.util.List;

import KodlamaIo.entities.Course;
import KodlamaIo.entities.Instructor;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instructor getAllByInstructorId(long instructorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
