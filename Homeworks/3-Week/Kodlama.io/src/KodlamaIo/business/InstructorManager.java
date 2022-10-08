package KodlamaIo.business;

import java.util.List;

import KodlamaIo.core.logging.Logger;
import KodlamaIo.dataAccess.instructor.InstructorDao;
import KodlamaIo.entities.Course;
import KodlamaIo.entities.Instructor;

public class InstructorManager {
		private InstructorDao instructorDao;
		private List<Logger> loggers;
		public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
			this.instructorDao = instructorDao;
			this.loggers = loggers;
		}
		public void add(Instructor instructor) throws Exception{
			  
			   instructorDao.add(instructor);
		  }
	    public void deleteById(long id){
	    	instructorDao.deleteById(id);
	    }
		
}
