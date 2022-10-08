package KodlamaIo.business;

import java.util.List;
import KodlamaIo.core.logging.Logger;
import KodlamaIo.dataAccess.course.CourseDao;
import KodlamaIo.entities.Course;

public class CourseManager {

	 private CourseDao courseDao;
	 private List<Logger> loggers;
	 
	 public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception{
		   if (courseDao.existsByName(course.getCourseName())) {
			   	throw new Exception("Course Name Already Exist");
		   }
		   	if (course.getUnitPrice()< 0) {
		   		throw new Exception("Course Price Cannot Be Less Than Zero");
			}
		   	courseDao.add(course);
	  }
    public void deleteById(long id){
	   courseDao.deleteById(id);
    }
}
