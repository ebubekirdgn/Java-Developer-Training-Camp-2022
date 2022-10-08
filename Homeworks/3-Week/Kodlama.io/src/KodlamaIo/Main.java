package KodlamaIo;

import java.util.List;

import KodlamaIo.business.CategoryManager;
import KodlamaIo.business.CourseManager;
import KodlamaIo.business.InstructorManager;
import KodlamaIo.core.logging.DatabaseLogger;
import KodlamaIo.core.logging.FileLogger;
import KodlamaIo.core.logging.Logger;
import KodlamaIo.core.logging.MailLogger;
import KodlamaIo.dataAccess.category.HibernateCategoryDao;
import KodlamaIo.dataAccess.course.JdbcCourseDao;
import KodlamaIo.dataAccess.instructor.HibernateInstructorDao;
import KodlamaIo.entities.Category;
import KodlamaIo.entities.Course;
import KodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<Logger> loggers = List.of(
				new DatabaseLogger(),
				new FileLogger(),
				new MailLogger());
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		Course course1 = new Course(1,"Programlama",500,instructor);
		Course course2 =  new Course(2,"Programlama",500,instructor);
		Course course3 = new Course(3,"Programlama",500,instructor);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		Category category = new Category("Programlama",1);
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
	   
	}
}